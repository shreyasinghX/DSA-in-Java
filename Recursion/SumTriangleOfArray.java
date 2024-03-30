package Patterns.Recursion;
import java.util.*;

public class SumTriangleOfArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        printTriangle(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void printTriangle(int arr[]){
        if(arr.length == 1){
            return;
        }
        int temp[]=new int[arr.length-1];
         helper(temp,arr,0);
         printTriangle(temp);
         System.out.println(Arrays.toString(temp));
    }

    public static void helper(int temp[],int arr[],int index){
           if(index==arr.length-1){
            return ;
           }

           temp[index]=arr[index]+arr[index+1];
           helper(temp,arr,index+1);
    }
}
