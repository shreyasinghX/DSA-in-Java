package Patterns.Recursion;

public class Rec1 {
    public static void main(String ags[]){
       print1(5);
    }
    static void print1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        print1(n-1);
        System.out.println(n);
    }
    
}
