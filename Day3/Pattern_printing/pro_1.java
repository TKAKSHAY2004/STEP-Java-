package Pattern_printing;
import  java.util.Scanner;


public class pro_1 {
    void pattern_1(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=n ; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    void pattern_2(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=n ; col++){
                System.out.print(row);
            }
            System.out.println("");
        }
    }
    void pattern_3(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=n ; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    void pattern_4(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    void pattern_5(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print(row);
            }
            System.out.println("");
        }
    }
    void pattern_6(int n){
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
    void pattern_7(int n){
        int first = 0 , second = 1;
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print(second + " ");
                int sum = first + second;
                first = second;
                second = sum;
            }
            System.out.println();
        }
    }
    void pattern_8(int n){
        int current = 1;
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=row ; col++){
                int fact=1;
                for(int i = 1; i <= current; i++) {
                    fact *= i;
                }
                System.out.print(fact + " ");
                current++;
                
            }
            System.out.println();
        }
    }
    void pattern_9(int n){
        int num = 1;           
        int sign = 1;
        for(int row = 1 ; row<=n ; row++){
            for(int col = 1 ; col<=row ; col++){
                System.out.print(num*num*sign + " ");
                num++;
                sign = sign*-1;
            }
            System.out.println("");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pro_1 obj = new pro_1();
        int n = sc.nextInt();
        obj.pattern_1(n);
        System.out.println("");
        obj.pattern_2(n);
        System.out.println("");
        obj.pattern_3(n);
        System.out.println("");
        obj.pattern_4(n);
        System.out.println("");
        obj.pattern_5(n);
        System.out.println("");
        obj.pattern_6(n);
        System.out.println("");
        obj.pattern_7(n);
        System.out.println("");
        obj.pattern_8(n);
        System.out.println("");
        obj.pattern_9(n);
        
    }
}
