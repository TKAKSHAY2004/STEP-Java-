import java.util.*;

class Item {
    String code, description;
    int quantity;
    double price, total;

    Item(String code, String description, int quantity, double price) {
        this.code = code;
        this.description = description;
        this.quantity = quantity;
        this.price = price;

        // Calculate total cost for this item based on quantity and price
        this.total = quantity * price;

        // Apply promotional discount if applicable
        if (code.equalsIgnoreCase("PROMO10")) {
            this.total *= 0.9; // 10% promo discount
        }
    }
}

public class RetailShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        String more;
        do {
            System.out.print("Enter Item Code: ");
            String code = sc.next();
            System.out.print("Enter Description: ");
            String desc = sc.next();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            // Create new Item object and add it to the list
            items.add(new Item(code, desc, qty, price));

            System.out.print("Add more items? (y/n): ");
            more = sc.next();
        } while (more.equalsIgnoreCase("y"));

        double grandTotal = 0;
        int totalQty = 0;
        System.out.println("\n--- Itemized Invoice ---");
        for (Item item : items) {
            // Display item details
            System.out.println(item.code + " - " + item.description + " - Qty: " + item.quantity + " - Total: ₹" + item.total);

            // Accumulate the total price of all items into grandTotal
            // item.total is the total cost of a single item (including any promo discount)
            grandTotal += item.total;

            // Accumulate the total quantity of items into totalQty
            totalQty += item.quantity;
        }

        System.out.printf("Subtotal: ₹%.2f\n", grandTotal);

        // Discounts
        if (grandTotal > 10000) {
            System.out.println("10% Discount Applied (Subtotal > ₹10000)");
            grandTotal *= 0.9;
        }
        if (totalQty > 20) {
            System.out.println("5% Quantity Discount Applied (Qty > 20)");
            grandTotal *= 0.95;
        }

        // Membership Discount
        System.out.print("Are you a member? (y/n): ");
        String isMember = sc.next();
        if (isMember.equalsIgnoreCase("y")) {
            System.out.println("2% Membership Discount Applied");
            grandTotal *= 0.98;
        }

        // Tax Calculation
        double tax = 0;
        if (grandTotal < 5000)
            tax = grandTotal * 0.05;
        else if (grandTotal <= 20000)
            tax = grandTotal * 0.10;
        else
            tax = grandTotal * 0.15;

        grandTotal += tax;
        System.out.printf("Tax: ₹%.2f\n", tax);

        // Payment mode
        System.out.print("Enter Payment Method (Cash/Credit): ");
        String method = sc.next();
        double surcharge = 0;
        if (method.equalsIgnoreCase("Credit")) {
            surcharge = grandTotal * 0.02;
            grandTotal += surcharge;
            System.out.printf("2%% Surcharge for Credit Payment: ₹%.2f\n", surcharge);
        }

        // Final check
        if (grandTotal < 500) {
            System.out.println("Final total below ₹500. Minimum purchase not met. Invoice not generated.");
            return;
        }

        // Loyalty Points
        int loyaltyPoints = (int)(grandTotal / 100);
        System.out.printf("\nFinal Payable Amount: ₹%.2f\n", grandTotal);
        System.out.println("Loyalty Points Earned: " + loyaltyPoints);
        System.out.println("--- Thank you for shopping! ---");
    }
}
