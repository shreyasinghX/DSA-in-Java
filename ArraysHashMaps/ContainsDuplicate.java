package Patterns.ArraysHashMaps;
import java.util.*;

public class ContainsDuplicate {

   public static void main(String args[]){
    int nums[]={12,34,4,5,4,5};
    System.out.println(containsDuplicate(nums));

   }
   public static boolean containsDuplicate(int nums[]){
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return true;
        }
    }
    return false;
}

    
}
