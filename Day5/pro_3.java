//Find the Minimum value of all elements in the array 

package Day5;

import java.util.Scanner;

class pro_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        int sum=0;
        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++){
            if(min > arr[i]){
                    min = arr[i];
            }
        }
        System.out.println("The minimum value of array: " + min);
    }
}
