import java.io.*;
import java.util.*;

/**
 * Algo
 * 1) Put all true in map (as potential starts);
 * 2) then put false in map where val+1 isin map
 * 3) create a local sezsize and seqstart in for loop;
 * 3) same size of seq then check which appear first in array
 * 4) size>max update max and start = seqstart
 */

class LongConsecutiveSeq{

public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a1 = Integer.parseInt(br.readLine());
    int[] ar1 = new int[a1];
    
    for(int i=0;i<a1;i++){
        ar1[i] = Integer.parseInt(br.readLine());
    }
    
    HashMap<Integer,Boolean> hm = new HashMap<>();
    
    for(int val:ar1){
        hm.put(val,false);
    }
    
    for(int val:ar1){
        if(hm.containsKey(val-1)){
            hm.put(val,false);
        }
    }
    int max = 0;
    int start = 0;
    
    for(int val:ar1){
        int sqsize = 1;
        int sqstart = val;
        
        while(hm.containsKey(val+1)){
            sqsize++;
            val++;
        }
        
        if(sqsize>max){
            max = sqsize;
            start = sqstart;
        }
        
        if(max == sqsize && start>sqstart){
            start = sqstart;
        }
    }
    
    // System.out.println(max+" "+start);
    for(int i=0;i<max;i++){
        System.out.println(start++);
    }
    
 }

}


/**
 * input  --> swap input of 0 and 6 to check which will come first 0 and 6 have same elemnts
 * 18
9
7
1
6
3
0
10
9
1
1
8
0
2
4
2
9
1
1
10
 */

 /**
  * output
  6
7
8
9
10
  */