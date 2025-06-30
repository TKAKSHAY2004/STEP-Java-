/* Simple Interest Calculation */

import java.util.Scanner;


public class pro_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float p = sc.nextFloat();
        System.out.println("Enter the rate");
        float r = sc.nextFloat();
        System.out.println("Enter the no. of year: " );
        int n = sc.nextInt();

        float Simple_Interest = (p*n*r)/100;

        System.out.printf("Simple Interest: %.2f" , Simple_Interest);
    }
}
