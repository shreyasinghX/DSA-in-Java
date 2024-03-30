package Patterns.Recursion;

public class Rec2 {
    public static void main(String args[]){
        print1(5);

    }

    static void print1(int n){
        if(n==0){
            return;
        }
       System.out.println(n);
       print1(n-1);
       System.out.println(n);
    }
}
