package Patterns.Recursion;

import java.util.ArrayList;
import java.util.*;

public class Permutation {
    public static void main(String args[]){
        permut("", "abc");
        System.out.println(permutat("","abc"));
        System.out.println(permutationcount("", "abc"));
    }
    public static void permut(String p,String up){
        if(up.isEmpty()){
           System.out.println(p);
           return;
        }
        
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            char ch=up.charAt(0);
            permut(f+ch+s,up.substring(1));

        }
    }

    public static ArrayList<String> permutat(String p, String up){
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);
            return ans;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutat(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    public static int permutationcount(String p, String up){
        int count=0;
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count= count+permutationcount(f+ch+s, up.substring(1));
        }
        return count;


    }
}
