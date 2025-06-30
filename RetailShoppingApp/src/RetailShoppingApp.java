import java.util.*;

class Item {
    private String code;
    private String description;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private double promoDiscount;

    public Item(String code, String description, int quantity, double unitPrice) {
        this.code = code;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = quantity * unitPrice;
        this.promoDiscount = 0.0;
        applyPromoDiscount();
    }

    private void applyPromoDiscount() {
        if (code.equalsIgnoreCase("PROMO10")) {
            promoDiscount = totalPrice * 0.10;
            totalPrice -= promoDiscount;
        }
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
    public double getTotalPrice() { return totalPrice; }
    public double getPromoDiscount() { return promoDiscount; }
}

class InvoiceGenerator {
    private List<Item> items;
    private boolean isMember;
    private String paymentMode;
    private double subtotal;
    private double discount;
    private double memberDiscount;
    private double tax;
    private double surcharge;
    private double finalTotal;
    private int totalQuantity;
    private double promoDiscountTotal;
    private int loyaltyPoints;
    private boolean invoiceCancelled;

    public InvoiceGenerator(List<Item> items, boolean isMember, String paymentMode) {
        this.items = items;
        this.isMember = isMember;
        this.paymentMode = paymentMode;
        this.subtotal = 0.0;
        this.discount = 0.0;
        this.memberDiscount = 0.0;
        this.tax = 0.0;
        this.surcharge = 0.0;
        this.finalTotal = 0.0;
        this.totalQuantity = 0;
        this.promoDiscountTotal = 0.0;
        this.loyaltyPoints = 0;
        this.invoiceCancelled = false;
        calculateInvoice();
    }

    private void calculateInvoice() {
        for (Item item : items) {
            subtotal += item.getTotalPrice();
            totalQuantity += item.getQuantity();
            promoDiscountTotal += item.getPromoDiscount();
        }
        double runningTotal = subtotal;

        if (runningTotal > 10000) {
            discount = runningTotal * 0.10;
            runningTotal -= discount;
        }
        if (totalQuantity > 20) {
            double qtyDiscount = runningTotal * 0.05;
            discount += qtyDiscount;
            runningTotal -= qtyDiscount;
        }

        if (isMember) {
            memberDiscount = runningTotal * 0.02;
            runningTotal -= memberDiscount;
        }

        if (runningTotal < 5000) {
            tax = runningTotal * 0.05;
        } else if (runningTotal <= 20000) {
            tax = runningTotal * 0.10;
        } else {
            tax = runningTotal * 0.15;
        }
        runningTotal += tax;

        if (paymentMode.equalsIgnoreCase("Credit Card")) {
            surcharge = runningTotal * 0.02;
            runningTotal += surcharge;
        }

        finalTotal = runningTotal;

        if (finalTotal < 500) {
            invoiceCancelled = true;
            return;
        }

        loyaltyPoints = (int) (finalTotal / 100);
    }

    public void printInvoice() {
        System.out.println("\n========= RETAIL SHOPPING INVOICE =========");
        System.out.printf("%-10s %-20s %8s %12s %12s\n", "Code", "Description", "Qty", "Unit Price", "Total");
        for (Item item : items) {
            System.out.printf("%-10s %-20s %8d %12.2f %12.2f\n",
                item.getCode(), item.getDescription(), item.getQuantity(), item.getUnitPrice(), item.getTotalPrice() + item.getPromoDiscount());
            if (item.getPromoDiscount() > 0) {
                System.out.printf("  (PROMO10 applied: -%.2f)\n", item.getPromoDiscount());
            }
        }
        System.out.println("-------------------------------------------");
        System.out.printf("%-35s: %10.2f\n", "Subtotal", subtotal + promoDiscountTotal);
        if (promoDiscountTotal > 0)
            System.out.printf("%-35s: -%10.2f\n", "Promotional Discounts", promoDiscountTotal);
        if (discount > 0)
            System.out.printf("%-35s: -%10.2f\n", "Discounts (Total/Qty)", discount);
        if (memberDiscount > 0)
            System.out.printf("%-35s: -%10.2f\n", "Membership Discount", memberDiscount);
        System.out.printf("%-35s: %10.2f\n", "Tax", tax);
        if (surcharge > 0)
            System.out.printf("%-35s: %10.2f\n", "Credit Card Surcharge", surcharge);
        System.out.println("-------------------------------------------");
        System.out.printf("%-35s: %10.2f\n", "Final Amount", finalTotal);
        System.out.printf("%-35s: %10d\n", "Loyalty Points Earned", loyaltyPoints);
        System.out.println("===========================================");
        if (invoiceCancelled) {
            System.out.println("WARNING: Final total is less than ₹500. Invoice cancelled.");
        }
    }

    public boolean isInvoiceCancelled() {
        return invoiceCancelled;
    }
}

public class RetailShoppingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        System.out.println("Welcome to Retail Shopping Invoice Generator!");
        while (true) {
            System.out.print("Enter item code: ");
            String code = sc.nextLine().trim();
            System.out.print("Enter description: ");
            String desc = sc.nextLine().trim();
            System.out.print("Enter quantity: ");
            int qty = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter unit price: ");
            double price = Double.parseDouble(sc.nextLine().trim());
            items.add(new Item(code, desc, qty, price));
            System.out.print("Add another item? (yes/no): ");
            String more = sc.nextLine().trim();
            if (!more.equalsIgnoreCase("yes")) break;
        }
        System.out.print("Is the customer a member? (yes/no): ");
        boolean isMember = sc.nextLine().trim().equalsIgnoreCase("yes");
        String paymentMode = "";
        while (true) {
            System.out.print("Enter payment mode (Cash/Credit Card): ");
            paymentMode = sc.nextLine().trim();
            if (paymentMode.equalsIgnoreCase("Cash") || paymentMode.equalsIgnoreCase("Credit Card")) break;
            System.out.println("Invalid payment mode. Please enter 'Cash' or 'Credit Card'.");
        }
        InvoiceGenerator invoice = new InvoiceGenerator(items, isMember, paymentMode);
        invoice.printInvoice();
        sc.close();
    }
}