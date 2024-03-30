package Patterns.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String args[]){
        int arr[]={2,3,4,4,56,43,22};
        System.out.println(search(arr, 4)) ;
        System.out.println(search2(arr, 4));
        findAllIndex(arr,4,0);
        System.out.println(list);
        System.out.println(findIndex(arr,4,0,new ArrayList<>()));
    }

    static int search(int []arr,int target){
        return helper(arr,target,0);
        
    }
    public static int helper(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helper(arr,target,index+1);
    }
    
    public static int  search2(int []arr,int target){
        return helper2(arr,target,arr.length-1);
    }
    static int helper2(int []arr,int target,int index){
        if(index ==-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return helper2(arr,target,index-1);
    }
    
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int []arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        
        findAllIndex(arr, target, index+1);
        
    }

    static ArrayList findIndex(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndex(arr,target,index+1,list);

    }


    static ArrayList find(int arr[],int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index ==arr.length){
            return list;
        }

        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFrombelowCalls=find(arr,target,index);
        list.addAll(ansFrombelowCalls);
        return list;
    }
}
