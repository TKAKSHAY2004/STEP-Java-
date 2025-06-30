// simple calculator

package Math_Problems;
import java.util.Scanner;

public class pro_2 {

    // Now the method returns the Simple Interest as double
    double Calculate_SimpleInterest(double p, double r, int n) {
        double SI = (p * n * r) / 100;
        return SI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time in years: ");
        int n = sc.nextInt();

        pro_2 obj = new pro_2();
        double result = obj.Calculate_SimpleInterest(p, r, n);

        System.out.printf("Simple Interest: %.2f\n", result);
    }
}
