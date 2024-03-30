package Patterns.ArraysHashMaps;
import java.util.*;

public class Itinerary {
    public static void main(String args[]){
        HashMap<String, String> tickets= new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi","Goa");
        FindItinerary(tickets);

    }

    public static void FindItinerary(HashMap<String,String> tick){
        HashMap<String ,String> RevMap =new HashMap<>();
        String start=null;
        for(String key: tick.keySet()){
            RevMap.put(tick.get(key),key);
        }
        for(String key: tick.keySet()){
            if(RevMap.containsKey(key)== false){
                 start=key;
            }
        }
        while(tick.containsKey(start)){
            System.out.print(start + "-->");
            start=tick.get(start);

        }
        System.out.print(start);
    }
}
