package Patterns.Recursion;
import java.util.*;

import java.util.ArrayList;

public class subseqIteration {
    public static void main(String args[]){
         int arr[]={1,2,2};
         System.out.println(subseqItr(arr));
         ArrayList<ArrayList<Integer>> ans=subsetDup(arr);
         for(ArrayList<Integer>list:ans){
            System.out.println(list);
         }
    }

    

    public static ArrayList<ArrayList<Integer>> subseqItr(int arr[]){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer>internal =new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static ArrayList<ArrayList<Integer>> subsetDup(int arr[]){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
       int start=0;
       int end=0;
       for(int i=0;i<arr.length;i++){
         start=0;
        if(i>0 && arr[i]==arr[i-1]){
            start=end+1;
        }
        end=outer.size()-1;
        for(int j=start;j<outer.size();j++){
            ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);

        }
       }
       return outer;
    }
}
