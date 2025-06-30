package Math_Problems;

import java.util.Scanner;

public class pro_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance(in kms): ");
        double dis = sc.nextDouble();
        System.out.print("Enter the time(in hrs): ");
        double time = sc.nextDouble();

        System.out.printf("Speed : %.2fKm/h", dis/time);

    }
}
