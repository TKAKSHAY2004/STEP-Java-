package Math_Problems;

import java.util.Scanner;

public class pro_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Bill Amount: ");
        double bill = sc.nextDouble();
        System.out.print("Enter no.of person: ");
        int n = sc.nextInt();

        System.out.printf("Amount per Person : %.2f", bill/n);

    }
}
