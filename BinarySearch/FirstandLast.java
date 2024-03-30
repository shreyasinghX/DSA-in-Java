package Patterns.BinarySearch;
import java.util.*;

public class FirstandLast {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,7,7,7,7,8,8,9};
        int an[]=fns(arr,7);
        System.out.print(Arrays.toString(an));

    }
    public static int[] fns(int arr[],int target){
       int  ans[]={-1,-1};
        ans[0]=search(arr, target, true);
        ans[1]=search(arr, target, false);
        return ans;
        
    }

    public static int search(int arr[],int target,boolean findStartIndex){
        int ans=-1;  
        int start=0;
        int end=arr.length-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
               end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
          }
          return ans;
    }
}
