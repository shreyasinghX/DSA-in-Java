package Patterns.BinarySearch;

public class InfiniteArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,7,8,9,40,47,89,90,99,100,110};
        System.out.println(findStartAndEnd(arr, 9));

    }
    public static int findStartAndEnd(int arr[],int target){
        int start=0;
        int end=1;
        int newS;
        while(target>arr[end]){
           newS=end+1;
           end=end+(end-start+1)*2;
           start=newS;

        }
        return search(arr,target,start,end);
    }
    public static int search(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;
                }
                else if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            
        }
        return -1;
    }
}
