package Day6;

import java.util.*;

public class pro_4 {
    public int Binary_Search(int arr[] , int val , int start , int end){
        if(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == val){
                return mid+1;
            }else if(arr[mid] < val){
                return Binary_Search(arr, val , mid+1,end);
            }else{
                return Binary_Search(arr, val , start,mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value for array");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value for array");
        int val = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        pro_4 obj = new pro_4();
        
        int result = obj.Binary_Search(arr, val, 0, arr.length-1);

        if(result == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Position of searched element : " + result);
        }

    }
}
