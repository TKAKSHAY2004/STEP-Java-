package RetailShop;
import java.util.Scanner;

public class pro_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the code: ");
        String code = sc.next();

        System.out.print("Enter the Description: ");
        String description = sc.next();

        System.out.print("Enter the quantity(in kg): ");
        int quantity = sc.nextInt();

        System.out.print("Rate per kg :$");
        double rate = sc.nextDouble();

        double total_cost = quantity * rate;

        System.out.println("-----Final Bill-----");

        System.out.println("code : " + code);
        System.out.println("Description : " + description);
        System.out.println("Quantity : " + quantity);
        System.out.println("Rate per Kg: " + rate);
        System.out.println("Total_Cost : " + total_cost);

    }
}
