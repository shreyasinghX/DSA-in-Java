package Patterns.ArraysHashMaps;
import java.util.*;

public class ConcatenationArr {

    public static void main(String args[]){
       int arr[]={1,2,3,4,5};
       int ans[]=getConcatenation(arr);
       System.out.println(Arrays.toString(ans));
    }
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int arr[]=new int [2*n];
        for(int i=0;i<n;i++ ){
           arr[i]=nums[i];
           arr[i+n]=nums[i];
        }
        return arr;
    }
    
}
