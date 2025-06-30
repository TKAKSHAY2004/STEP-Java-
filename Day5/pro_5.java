package Day5;

import java.util.Scanner;

public class pro_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element to be searched: ");
        int key = sc.nextInt();
        
        boolean found = false;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == key){
                System.out.println("The postioned of searched element is : " + (i+1));
                found = true;
                continue;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}
