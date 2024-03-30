package Patterns.Recursion;
import java.util.*;

public class Reverse {
    public static void main(String args[]){
         System.out.println(reverse(1234,4));
    }
    static int reverse(int n,int digit){
        if(n%10 == n){
            return n;
        }
        int rem=n%10;
        return rem*((int)Math.pow(10,digit-1)) + reverse(n/10, digit-1);
    }
}
