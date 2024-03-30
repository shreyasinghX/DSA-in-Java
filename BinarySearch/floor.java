package Patterns.BinarySearch;

public class floor {
    public static void main(String args[]){
        int arr[]={1,2,34,45,56,67};
        System.out.println(floor(arr,46));

    }
    public static int floor(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
        }
        return end;
    }
}