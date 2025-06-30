//Create a program to compute the sum of all elements in a 2D array. 

package Day6;

import java.util.Scanner;
public class pro_6 {

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
        int sum=0;
        System.out.println("The given Matrix");
        for(int i=0 ; i<n ;i++){
            for(int j= 0;j<m ;j++){
                System.out.print(a[i][j] + " ");
                sum = sum + a[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of elements in given matrix : " + sum);
    }
}

