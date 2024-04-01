package Patterns.ArraysHashMaps;

import java.util.Arrays;

public class ReplaceElementsWithGreatestOnRight {
    public static void main(String args[]){
        int arr[]={12,3,4,56,7,8};
        int ans[]=replaceElements(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] replaceElements(int[] arr) {
        int n=arr.length;
        int newarr[]=new int[n];
        newarr[n-1]=-1;
        for(int i=n-1;i>=1;i--){
            
            newarr[i-1]=Math.max(arr[i],newarr[i]);
        }
        return newarr;
    }
    
}
