//Write a program to accept n and store the elements into the array of size n.

package Day5;

import java.util.Scanner;
public class pro_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Enter the value of array: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

