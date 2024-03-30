package Patterns.Recursion;
import java.util.*;

public class MergeInPlacce {
    public static void main(String args[]){
         int arr[]={3,67,65,8,9};
         mergeInPlace(arr,0,arr.length);
         System.out.print(Arrays.toString(arr));
    }

    public static void mergeInPlace(int arr[],int s,int e){
        if(e-s==1){
            return ;
        }
        int mid = (s+e)/2;
        mergeInPlace(arr, s, mid);
        mergeInPlace(arr, mid, e);
        merge(arr,s,mid,e);
    }
    public static void merge(int arr[],int s,int mid,int e){
        int mix[]=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;

            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
        



    }
}
