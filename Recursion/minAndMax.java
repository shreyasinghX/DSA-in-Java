package Patterns.Recursion;
import java.util.*;

public class minAndMax {
    public static void main(String args[]){
         int arr[]={1,34,-1,3,5};
         System.out.println(min(arr));
         System.out.println(max(arr));

    }
    public static int min(int arr[]){
        return helper( arr,Integer.MAX_VALUE,0);
    }

    public static int helper(int arr[],int min,int index){
        if(index==arr.length){
            return min;
        };
        if(arr[index]<min){
            min=arr[index];
           
        }
        return helper(arr,min,index+1);
    }

    public static int max(int arr[]){
        return helper2( arr,Integer.MIN_VALUE,0);
    }

    public static int helper2(int arr[],int max,int index){
        if(index==arr.length){
            return max;
        };
        if(arr[index]>max){
            max=arr[index];
           
        }
        return helper2(arr,max,index+1);
    }
}
