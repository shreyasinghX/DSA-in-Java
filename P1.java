package Patterns;
import java.util.*;
public class P1{
    public static void main(String args[]){
          pattern1(4);
          pattern2(4);
          pattern3(4);
          pattern4(4);
          pattern5(5);
          pattern6(5);
          pattern7(5);
          pattern8(4);
    }

    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1;i<2*n;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i=1;i<2*n;i++){
            if(i<=n){
                for(int space=1;space<=n-i;space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }

            }
            else{
                for(int space=1;space<=i-n;space++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern8(int n){

        for(int i=0;i<=2*n;i++){
        for(int j=0;j<=2*n;j++){
           int everyIndex = Math.min(Math.min(i,j), Math.min(2*n-i,2*n-j));
           System.out.print(everyIndex + " ");
        }
        System.out.println();
       }
    }
}
