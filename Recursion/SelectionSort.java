package Patterns.Recursion;
import java.util.*;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={1,34,2,344,55,4};
        selection(arr, arr.length, 0, 0);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] selection(int arr[],int r,int c,int max){
        if(r==0){
            return arr;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                return selection(arr,r,c+1,c);

            }
            else{
                return selection(arr,r,c+1,max);
            }

        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            return selection(arr,r-1,0,0);
        }
    }
}
