package Day6;

import java.util.*;
public class pro_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value for array");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}