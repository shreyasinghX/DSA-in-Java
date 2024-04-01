package Patterns.ArraysHashMaps;

public class Subsequence {
    public static void main(String args[]){
        String s="abd";
        String t="acebd";
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;

            }
            else{
                j++;
            }
        }
        if(j>t.length() || i<s.length()){
            return false;
        }

        return true;
       
    }
}
