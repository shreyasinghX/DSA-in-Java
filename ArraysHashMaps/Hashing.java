package Patterns.ArraysHashMaps;

import java.util.HashMap;
import java.util.*;

public class Hashing {
    public static void main(String args[]){
        HashMap<String , Integer>map=new HashMap<>();
        
        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China",129);
        // System.out.println(map);
        map.put("India",160);
        System.out.println(map); 

        // Search
        if(map.containsKey("Indonesiaa")){
            System.out.println("keyy is present in the map");
        }
        else{
            System.out.println("key is not present in the map"); 
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia"));
        
        for(Map.Entry<String, Integer>e : map.entrySet() ){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set <String>keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    
    }

    
}
