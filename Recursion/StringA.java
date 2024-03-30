package Patterns.Recursion;

public class StringA {
    public static void main(String args[]){
        String atr="baccad";
        System.out.println(stringA(atr,0));
        skip("",atr);
        System.out.println(skip2(atr));

    }
    public static String  stringA(String str,int index){
        
        
        if(index > str.length()-1){
            return "";
        }
        char ch=str.charAt(index);
        
        if(ch=='a'){
            return stringA(str,index+1);

        }
        else{
            
            return ch+stringA(str, index+1);
        }
        
    }

    public static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));


        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    public static String skip2(String str){
        if(str.length()==1){
            return str;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip2(str.substring(1));
        }
        else{
            return ch+skip2(str.substring(1));
        }
    }
}
