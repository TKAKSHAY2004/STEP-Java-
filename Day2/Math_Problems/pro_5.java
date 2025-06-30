package Math_Problems;

import java.util.Scanner;

public class pro_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance travelled: ");
        double dis = sc.nextDouble();
        System.out.print("Enter Amount of Litres: ");
        double lit = sc.nextDouble();

        System.out.printf("The Mileage is (in Kms) : %.3f", dis/lit);

    }
}

