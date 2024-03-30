package Patterns.Recursion;

public class SumofDigits {
    public static void main(String args[]){
          System.out.println(Sum(1342));
    }

    static int Sum(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+Sum(n/10);
    }
}
