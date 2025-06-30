//Find the Maximum value of all elements in the array

package Day5;

import java.util.*;

public class pro_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value of array: " + max);
    }
}
