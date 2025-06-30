//sort the array in acsending or decsending order based on user request

package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class pro_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value for array");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the order : ");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch== 'a'){
            for(int i=0 ; i<n ; i++){
                for(int j=i+1 ; j<n ; j++){
                    if(arr[j] < arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("Sorted Array in Ascending Order: " + Arrays.toString(arr));
        }
        if(ch == 'D' || ch == 'd'){
            for(int i=0 ; i<n ; i++){
                for(int j=i+1 ; j<n ; j++){
                    if(arr[j] > arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("Sorted Array in Decsending Order: " + Arrays.toString(arr));
        }
    }
}
