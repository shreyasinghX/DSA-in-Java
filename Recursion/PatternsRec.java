package Patterns.Recursion;

public class PatternsRec {
    public static void main(String args[]){
        Pattern1(4,0);
        Pattern2(0,0);
    }
    public static void Pattern1(int r,int c){
         
        if(r==0){
            return;
        } 
        if(c<r){
           
            Pattern1(r,c+1);
            System.out.print("*");
        }
        else{
            
            
            Pattern1(r-1,0);
            System.out.println();
        }
    }

    public static void Pattern2(int r,int c){
        if(r>4){
            return;
        }

        if(c<r){
            System.out.print("*");
            Pattern2(r,c+1);
        }
        else{
            System.out.println();
            Pattern2(r+1,0);
        }
    }
}
