package Patterns;

public class fibonacci {
    public static void main(String args[]){
         System.out.println(Fibo(3 ));
    }
    static int Fibo(int n){
        if(n==0 || n==1){
            return n;
            
        }
        int x=Fibo(n-1)+Fibo(n-2);
        return x;
    }
}
