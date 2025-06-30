//Display the number of odd and even numbers from the array
package Day5;

import java.util.Scanner;

public class pro_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int even=0;
        int odd=0;
        System.out.println("Even number from array:");
        for(int i=0 ; i<n ; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
                even++;
            }
        }
        System.out.println();
        System.out.println("Odd number from array:");
        for(int i=0 ; i<n ; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
                odd++;
            }
        }
        System.out.println();
        System.out.println("Number of even:" + even);
        System.out.println("Number of odd: " + odd);
        
    }
}
