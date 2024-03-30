package Patterns.ArraysHashMaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCodeSame {
   static class HashMap<K,V>{
    private class Node{
        K key;
        V value;
        private Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }

    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    public HashMap(){
        N=4;
        this.buckets=new LinkedList[N];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
    }
    

    private int hashFunction(K key){
        int bi= key.hashCode();
        return Math.abs(bi)%N;
        
    }

    private int SearchinLL(K key,int bi){
       LinkedList<Node> ll =buckets[bi];
       for(int di=0;di<ll.size();di++){
         Node node=ll.get(di);
         if(node.key == key){
            return di;
         }

       }
       return -1;
    }

    private void rehash(){
        LinkedList<Node> []oldbucket=buckets;
        buckets=new LinkedList[N*2];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();

        }
        for(int i=0;i<oldbucket.length;i++){
            LinkedList<Node>ll=oldbucket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }

    }

    public void put(K key, V value){
        int bi=hashFunction(key);
        int di = SearchinLL(key ,bi);
        if(di==-1){
            buckets[bi].add(new Node(key,value)) ;
            n++;
        }
        else{
            Node node=buckets[bi].get(di);
            node.value=value;
        }
        double lambda=(double)(n/N);
        if(lambda >2.0){
            rehash();
        }

    }
    public boolean containsKey(K key){
        int bi=hashFunction(key);
        int di=SearchinLL(key,bi);
        if(di==-1){
            return false;
        }
        return true;
    }

    public V remove(K key){
        int bi=hashFunction(key);
        int di=SearchinLL(key, bi);
        if(di ==-1){
            return null;
        }
        else{
            Node node = buckets[bi].remove(di);
            n--;
            return node .value;
        }
    }

    public V get(K key){
        int bi=hashFunction(key);
        int di=SearchinLL(key, bi);
        if(di==-1){
            return null;
        }
        else{
            Node node =buckets[bi].get(di);
            return node.value;
        }
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys= new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
            LinkedList<Node>ll=buckets[i];
            for(int j=0;j<ll.size();j++){
                 Node node= ll.get(j);

                 keys.add(node.key);
            }
        }
        return keys;
    
   } 
}

    public static void main(String args[]){
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Shreya",10000000);
        map.put("Aman Manwani",1000);
        map.put("Vasu Devrani",10000);
        map.put("Avantika",10000000);
        map.put("Megha",10000000);
        map.put("Kanya",1000);
        map.put("Tanishka",10000);
        map.put("Sakshi",10000000);
        map.put("Arpit",10000000);


       
       ArrayList<String> keys = map.keySet();
    //    for(int i=0;i<keys.size();i++){
    //        System.out.println(keys.get(i)+" : "+map.get(keys.get(i))); 
    //    }
    for(String key:keys){
        System.out.println(key + " : "+ map.get(key));
    }
    }
}
