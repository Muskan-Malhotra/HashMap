import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * Algo 
 * got an array k positiob sorted;
 * first add element till k+1
 * start removing till for loop ends
 * remaining pq elemnts can be removed with while(As by while all the element are added in the queue of an array)
 */
class Ksorted {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      
      for(int i=0;i<arr.length;i++){
          if(i<k+1){
            pq.add(arr[i]);
          }
          else{
              System.out.println(pq.remove());
              pq.add(arr[i]);
          }
      }
      
      while(pq.size()>0){
          System.out.println(pq.remove());
      }
   }

}