package Patterns.BinarySearch;

public class ceiling {
    public static void main(String args[]){
       int  arr[]={1,2,34,45,56,78};
       System.out.println(ceilingnum(arr,79));

    }
    public static int ceilingnum(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
               start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }

        }
        return start;
    }
}
