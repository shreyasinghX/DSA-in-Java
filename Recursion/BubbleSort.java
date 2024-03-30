package Patterns.Recursion;
import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        int arr[]={1,23,4,67,8,9};
        Bubble(arr, arr.length, 0);
        System.out.print(Arrays.toString(arr));

    }
    

    public static int[] Bubble(int arr[],int r ,int c){
        
        if(r==0){
            return arr ;
        }
        if(c<r-1){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            return Bubble(arr,r,c+1);
        }
        else{
            return Bubble(arr,r-1,0);
        }
        

    }
}
