package RetailShop;

import java.util.Scanner;

public class pro_2 {
    public static void main(String[] args) {

/* 9.2 Iterative Item Entry and Grand Total 
Objective: Enable multiple items to be added iteratively, and compute the grand total for all items. 
Key Steps: 
1. Use a loop to accept details for multiple items. 
2. Compute the grand total by summing individual totals. 
3. Display the grand total after all items have been entered. */


        Scanner sc = new Scanner(System.in);
        String choice;
        int total_quantity = 0;
        double grand_total = 0.0;
        double discount_amount = 0.0;

        do {
            
            System.out.print("Enter the code: ");
            String code = sc.next();

            System.out.print("Enter the Description: ");
            String description = sc.next();

            System.out.print("Enter the quantity(in kg): ");
            int quantity = sc.nextInt();

            System.out.print("Rate per kg :$");
            double rate = sc.nextDouble();

            double total_cost = quantity * rate;

            grand_total += total_cost;
            total_quantity += quantity;

            System.out.println("\nDo you want to add another item? (y/n):");
            choice = sc.next();
        } while(choice.equalsIgnoreCase("y"));
        System.out.println("-----Final Bill-----");
        System.out.printf("Grand_Total : %.2f\n" , grand_total);


/*9.3 Applying Discounts 
Objective: Introduce business rules for modifying the grand total based on conditions. 
Rules Implemented: 
1. Discount: If the grand total exceeds ₹10,000, apply a 10% discount. 
2. Quantity Discount: If the total quantity exceeds 20, apply an additional 5% discount on the 
grand total (after other discounts). 
Key Steps: 
1. Check conditions for discounts. 
2. Adjust the grand total accordingly. 
3. Display the modified total with adjustments explained.*/


        System.out.println("Total_Quantity : " + total_quantity);

        double discount=0.0;
        
        if(grand_total > 10000){
            discount = discount + grand_total*0.1;
            System.out.printf("Discount  : %.2f\n", discount);
            if(total_quantity > 20){
                double after_discount = grand_total - discount;
                System.out.println("Since quatity is more than 20 we have additional discount of 5%");
                discount = discount + 0.05 * after_discount;
                grand_total = grand_total - discount;
            }
        }
/*
 9.4 Membership Discounts 
Objective: Introduce a membership system where customers get an additional discount. 
Rules Implemented: 
1. If the customer is a member (choice: 'y'), apply an additional 2% discount on the grand total 
after all other adjustments. 
Key Steps: 
1. Prompt the user for membership status. 
2. Apply the membership discount if applicable. 
3. Update and display the final grand total.
 */
        double membership;
        double membership_discount;
        System.out.print("Do you have Membership(y/n)? ");
        char ch = sc.next().charAt(0);
        if(ch == 'y' || ch== 'Y' ){
            membership = grand_total-discount;
            membership_discount = membership *  0.02;
            grand_total = membership-membership_discount;
            System.out.printf("Total Amount(Applied Membership Discount) : %.2f\n", grand_total);
        }else{
            grand_total = grand_total - discount;
            System.out.printf("Total Discount: %.2f\n", discount);
            System.out.printf("Total Amount : %.2f\n", grand_total);
        }

/*
 9.5 Tax Calculation Based on Purchase Amount 
Objective: Introduce tiered tax rates based on the grand total. 
Rules Implemented 
1. If the grand total is below ₹5,000, apply 5% tax. 
TalenciaGlobal HandsOn Framework - THLF 
2. If the grand total is between ₹5,000 and ₹20,000, apply 10% tax. 
3. If the grand total exceeds ₹20,000, apply 15% tax. 
Key Steps 
1. Calculate the tax based on the applicable tier. 
2. Add the tax to the grand total. 
3. Display the tax amount and updated grand total. 

 */
        double tax=0;
        if (grand_total<5000){
            tax = tax + grand_total*0.05;
            grand_total = grand_total+tax;

        }else if(grand_total>=5000 && grand_total<20000){
            tax = tax + grand_total*0.1;
            grand_total = grand_total + tax;
        }else{
            tax = tax + grand_total * 0.15;
            grand_total = grand_total+tax;
        }
        System.out.printf("Total_Amount(Including grand_total) : %.2f\n",grand_total) ;
        
/*
 9.6 Promotional Discounts on Specific Items 
Objective: Introduce promotional discounts on specific items identified by their code. 
Rules Implemented 
1. If the item code matches a promotional code (e.g., PROMO10), apply a 10% discount on that 
item. 
2. Compute the grand total considering the discounts on applicable items. 
Key Steps 
1. Check if the item code matches the promotional code. 
2. Apply the discount to the item total. 
3. Update the grand total and display the final value.
 */



 /*
  9.7 Payment Mode Rules 
Objective: Incorporate business rules based on the selected payment method. 
Rules Implemented 
1. If the customer chooses Cash, no surcharge applies. 
2. If the customer chooses Credit Card, apply a flat 2% surcharge on the final grand total after 
all adjustments. 
Key Steps 
1. Prompt the user to select the payment method. 
2. Apply the surcharge if the method is Credit Card. 
3. Display the payment method, surcharge amount, and final payable amount
  */


        System.out.println("Enter the mode of payement(cash/card) ? " );
        String payment = sc.next();
        double charges;
        if(payment.equalsIgnoreCase("card")){
            charges = grand_total*0.02;
            System.out.printf("Total_Amount(After payment): %.2f", grand_total + charges);
        }else{
            System.out.printf("Total_Amount(After payment): %.2f", grand_total);
        }
/*
9.8 Minimum Purchase Requirements 
Objective 
Add a condition to enforce a minimum purchase value to generate an invoice. 
Rules Implemented 
1. If the final grand total (after discounts and taxes) is below ₹500, inform the user that the 
minimum purchase amount is not met. 
Key Steps 
1. Check the final grand total. 
2. If below ₹500, display an appropriate message and terminate the process. 
3. Otherwise, proceed to generate the invoice. 
 */
        if(grand_total < 500){
            System.out.println("minimum purchase amount is not met");
            
        }

/*
9.9 Loyalty Points 
Objective: Introduce a loyalty program where customers earn points based on the final grand total. 
Rules Implemented 
1. For every ₹100 spent, the customer earns 1 loyalty point. 
2. Display the total loyalty points earned. 
Key Steps 
1. Calculate loyalty points (points = grand_total // 100). 
2. Display the earned points along with the invoice.*/
        
        int loyalty_points;
        loyalty_points = (int)Math.floor(grand_total/100);

        System.out.println("Loyalty_points: " + loyalty_points);
    }
}
