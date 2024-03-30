package Patterns.Recursion;

public class SortedorNot {
    public static void main(String args[]){
          int arr[]={1,4,5,60,7};
          System.out.println(isSorted(arr));
    }

    static boolean isSorted(int []arr){
        return helper(arr,0);
    }
    public static boolean helper(int []arr,int i){
         if(i==arr.length-1){
            return true;
         }
        return (arr[i]<arr[i+1]) && helper(arr,i+1);
    }
}
