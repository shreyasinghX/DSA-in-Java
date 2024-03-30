package Patterns.ArraysHashMaps;


import java.util.*;

public class Union {
    public static void main(String args[]){
        int arr1[]={7,3,8};
        int arr2[]={1,2,5,4,8,7};
        System.out.println(unionArr(arr1, arr2));
    }

    public static int unionArr(int arr1[],int []arr2){
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
}
