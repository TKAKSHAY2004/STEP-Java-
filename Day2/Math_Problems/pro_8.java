package Math_Problems;

import java.util.Scanner;

public class pro_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit Consumed: ");
        double units = sc.nextDouble();

        double bill = 0;

        if (units <= 100) {
            System.out.println("Electric Bill is Free");
        } 
        else if (units <= 200) {
            bill = (units - 100) * 2;
            System.out.printf("Electric Bill: ₹%.2f\n", bill);
        } 
        else if (units <= 500) {
            bill = (units - 100) * 6;
            System.out.printf("Electric Bill: ₹%.2f\n", bill);
        } 
        else {
            bill = (units - 100) * 10;
            System.out.printf("Electric Bill: %.2f\n", bill);
        }
    }
}

