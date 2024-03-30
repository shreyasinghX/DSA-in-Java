package Patterns.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Phonecombination {
    public static void main(String args[]){
        pad("","12");
        System.out.println(helper("","12"));

    }
    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i=3*(digit-1);i<(3*digit);i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
     public static ArrayList<String> helper(String p,String up){
        ArrayList<String> list =new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';

        for(int i=(digit-1)*3;i<3*(digit);i++){
            char ch=(char)('a'+i);
             list.addAll(helper(p+ch,up.substring(1)));

        }
        return list;
    }
   
}
