import java.io.*;
import java.util.*;

/**
 * Time Complexity:
The time complexity for this solution is O(n x logk). This is because we are traversing the entire array which takes O(n) time. Inside the traversal loop, we are removing the elements from the priority queue. Removing an element from the priority queue takes O(logk) time since the size of the priority queue is O(k). Hence the overall time complexity becomes O(n x logk).

Space Complexity:
The space complexity for this solution is O(k) as we have created a priority queue of size k+1. Though we are adding and removing the elements from it still we have created it only once and the same priority queue is used for the entire procedure. Thus the space complexity is O(k).
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