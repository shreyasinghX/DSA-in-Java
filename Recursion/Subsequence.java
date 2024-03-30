package Patterns.Recursion;
import java.util.*;

public class Subsequence {
    public static void main(String args[]){
        System.out.println(subseq("", "abc"));
        ArrayList<String>list=new ArrayList<>();
        System.out.print(subseq2("", "abc", list));

    }
    
    public static ArrayList<String> subseq(String p,String up ){
        ArrayList<String> list =new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
         ArrayList<String> left= subseq(p,up.substring(1));
         ArrayList<String> right= subseq(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static ArrayList<String> subseq2(String p,String up,ArrayList<String>list){
        if(up.isEmpty()){
            list.add(p);
            
        }
        else{
        char ch=up.charAt(0);
         subseq2(p,up.substring(1),list);
         subseq2(p+ch,up.substring(1),list);
        }
         return list;
       


    }
}
