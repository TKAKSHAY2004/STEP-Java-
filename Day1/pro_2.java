import java.util.Scanner;

public class pro_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the salary: " );
        float salary = sc.nextInt();

        if(salary < 300000){
            System.out.println(salary);
            System.out.printf("Total Amount: %.2f", salary);
        }else if (300000 <= salary && salary<=499999){
            System.out.printf("Tax: %.2f\n" , salary * 0.1);
            System.out.printf("Total Amount: %.2f", salary - salary*0.1);

        }else if (500000 <= salary && salary < 700000){
            System.out.printf("Tax: %.2f\n", salary * 0.15);
            System.out.printf("Total Amount: %.2f", salary - salary*0.15);
        }else if (700000 <= salary && salary < 2000000){
            System.out.printf("Tax : %.2f\n",  salary * 0.3);
            System.out.printf("Total Amount: %.2f", salary - salary*0.3);
        }else{
            System.out.printf("Tax : %.2f\n",salary*0.35);
            System.out.printf("Total Amount: %.2f", salary - salary*0.35);
        }
        

    }
}
