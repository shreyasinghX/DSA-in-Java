package Patterns.Recursion;

public class FirstUppercase {
    public static void main(String args[]){
        String str="geeKs";
        System.out.println(upper(str,0));
        Print(10);
    }
    public static char upper(String str,int index){
        if(Character.isUpperCase(str.charAt(index))){
            return  str.charAt(index);
        }
        return upper(str,index+1);
    }

    public static void Print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        Print(n-1);
        System.out.println(n);
    }
}
