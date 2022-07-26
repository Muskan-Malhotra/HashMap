import java.io.*;
import java.util.*;

/**
 * TIME COMPLEXITY- O(n)
SPACE COMPLEXITY- O(n) where n=number of entities in the hashmap.
 */
class GCE{

public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a1 = Integer.parseInt(br.readLine());
    int[] ar1 = new int[a1];
    
    for(int i=0;i<a1;i++){
        ar1[i] = Integer.parseInt(br.readLine());
    }
    
    
    int a2 = Integer.parseInt(br.readLine());
    
    int[] ar2 = new int[a2];
    
    for(int i=0;i<a2;i++){
        ar2[i] = Integer.parseInt(br.readLine());
    }
    
    HashMap<Integer,Integer> hm = new HashMap<>();
    
    for(int i=0;i<ar1.length;i++){
        
        if(hm.containsKey(ar1[i])){
            int oval = hm.get(ar1[i]);
            hm.put(ar1[i],oval+1); 
        }
        else{
            hm.put(ar1[i],1);
        }
    }
    // System.out.println(hm);
    for(int i=0;i<ar2.length;i++){
        
        if(hm.containsKey(ar2[i])){
            System.out.println(ar2[i]); 
            hm.remove(ar2[i]);
        }
        
    }
    
 }

}