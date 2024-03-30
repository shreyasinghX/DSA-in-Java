package Patterns.Recursion;

public class reverseString {
    public static void main(String args[]){
          System.out.println(reverse("hello"));
    }
    public static String reverse(String str){
        return helper( "",str);
    }
    public static String helper(String p,String up){
         if(up.isEmpty()){
            return p;
         }
         int index=up.length()-1;
         char ch=up.charAt(index);
         return helper(p+ch,up.substring(0,up.length()-1));
    }
}
