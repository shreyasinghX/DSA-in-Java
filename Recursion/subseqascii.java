package Patterns.Recursion;

public class subseqascii {
    public static void main(String args[]){
          Subsequence("", "abc");
    }
    public static void Subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Subsequence(p, up.substring(1));
        Subsequence(p+ch, up.substring(1));
        Subsequence(p+(ch+0), up.substring(1));

    }
}
