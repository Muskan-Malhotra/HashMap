import java.io.*;
import java.util.*;

/**
 * TIME COMPLEXITY- O(n)
SPACE COMPLEXITY- O(n) where n= number of entities in the Hashmap.
 */

/**
 * Algo:
 * remove freq once you get it in arr2
 */

class GCE2{

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
    
    for(int val : ar1){
        if(hm.containsKey(val)){
            int nfq = hm.get(val)+1;
            hm.put(val,nfq);
        }
        else{
            hm.put(val,1);
        }
    }
    // System.out.print(hm);
    
    for(int val :ar2){
        if(hm.containsKey(val)){
            int nfq = hm.get(val)-1;
            hm.put(val,nfq);
            if(hm.get(val) >=0){
                System.out.println(val);
            }
        }
    }
 }

}