//Write a program to create a 2D array and display its elements row-wise. 
package Day6;

import java.util.Scanner;

public class pro_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0 ; i<n ;i++){
            for(int j= 0;j<m ;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given Matrix");
        for(int i=0 ; i<n ;i++){
            for(int j= 0;j<m ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
