package Patterns.Recursion;
import java.util.*;

public class QuickSortRec {
    public static void main(String args[]){
       int arr[]={23,4,5,1,2,33,45};
       quickSort(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
       
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
        while(arr[e]>pivot){
                e--;
            }
        if(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        }
       

        quickSort(arr, low,e);
        quickSort(arr, s, high);
    }
}
