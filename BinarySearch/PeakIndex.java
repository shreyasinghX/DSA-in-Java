package Patterns.BinarySearch;

public class PeakIndex {
    public static void main(String args[]){
       int arr[]={1,2,6,8,2,1};
       System.out.println(peak(arr));
    }

    public static int peak(int arr[]){
        int peak=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[peak]){
                peak=i;
            }

        }
        return peak;
    }
}
