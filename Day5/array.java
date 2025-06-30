package Day5;


import java.util.Scanner;
public class array {

    void sum(int n , int[] arr){
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum = sum+arr[i];
        }
        System.out.println(sum);  
    }
    int min(int n,int[] arr){
        int min = arr[0];
        for(int i=1 ; i<n ; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }
    int max(int n,int[] arr){
        int max = arr[0];
        for(int i=1 ; i<n ; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
    int search(int n,int[] arr,int key){
        
        for(int i=0 ; i<n ; i++){
            if(arr[i] == key ){
                return i+1;
            }
        }
        return -1; //not found
    }
    void evenodd(int n , int arr[]){
        int even=0;
        int odd=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even : " + even);
        System.out.println("Number of even : " + odd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        array obj = new array();
        obj.sum(n,arr);
        System.out.println("Minimum of Array: " + obj.min(n,arr));
        System.out.println("Maximum of Array: " + obj.max(n,arr));

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int pos = obj.search(n, arr, key);
        if(pos == -1){
            System.out.println("Element not found.");
        } else {
            System.out.println("Position of searched element: " + pos);
        }
        
        obj.evenodd(n, arr);
    }
}
