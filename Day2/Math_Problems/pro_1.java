//calculate BMI
package Math_Problems;
import java.util.Scanner;
public class pro_1 {

    void Calculate_BMI(int w , float h){
        double bmi = w / (h*h);
        
        System.out.printf("BMI : %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Category: Normal weight");
        } else {
            System.out.println("Category: Overweight");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight(in kg) and height(in m):");
        int w = sc.nextInt();
        float h = sc.nextFloat();

        pro_1 obj = new pro_1();
        obj.Calculate_BMI(w, h);

    }
}
