//temperature converter
package Math_Problems;

import java.util.Scanner;

public class pro_3 {
    double temperature(int choice, double degree){
        switch (choice) {
            case 1: 
                System.out.println("Celius - Fahrenhite");
                return (degree*9)/5 + 32;
                
            case 2:
                System.out.println("Fahrenhite - Celcius");
                return (degree - 32)*5/9;
            default:
                System.out.println("Invalid Choice");
                return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Degree: ");
        double degree = sc.nextDouble();
        System.out.println("1.Cel - Fah");
        System.out.println("2.Fah - Cel");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        pro_3 obj = new pro_3();
        double result = obj.temperature(choice , degree);

        if (result != -1){
            System.out.printf("Converted Temperature: %.2f",result);
        }
    }
}
