/*Accept the number and find even or odd */

import java.util.Scanner;

class pro_1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(num % 2 == 0){
        System.out.println("Even");
    }else{
        System.out.print("odd");
    }

    }
}