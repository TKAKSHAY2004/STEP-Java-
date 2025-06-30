//Find the Sum of all elements in the array

package Day5;
import java.util.Scanner;

public class pro_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        int sum=0;
        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum of Array: " + sum);
    }
}



