package Day6;

import java.util.Scanner;

public class pro_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of row: ");
        int n = sc.nextInt();
        System.out.print("Enter no.of column: ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0 ; i<n ;i++){
            for(int j= 0;j<m ;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the search element : ");
        boolean found = false;
        int key = sc.nextInt();
        for(int i=0 ; i<n ;i++){
            for(int j= 0;j<m ;j++){
                if(a[i][j]== key){
                    System.out.println("The position of searched elements is in [" + (i+1) + "]["+ (j+1) +"]");
                    found = true;
                    break;
                }
            }
            System.out.println();
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
