import java.io.*;
import java.util.*;

/**
 * Time Complexity: O((n log(k))
The time complexity of for loop (k log(k) + 2((n-k) log(k))).

The time complexity of the while loop (k log(k)).Which sum up to O(n log(k)).

Space Complexity: O(k)
The space complexity for the function O(k), which is the size of the priority queue used.
 */

 /**
  * Algo
  fill first k elemnts
  check if peek<arr[i]  -- if true remove() and add(arr[i]) else nothing
  */

class KthLargest {

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
          
          if(pq.size()<k){
              pq.add(arr[i]);
          }
          else if(pq.size() == k){
              if(pq.peek()<arr[i]){
                  pq.remove();
                  pq.add(arr[i]);
              }
          }
      }
    //   System.out.println(pq);
    while(pq.size()>0){
        System.out.println(pq.remove());
    }
    
    }

}

/**
 * Sample Input
13
12
62
22
15
37
99
11
37
98
67
31
84
99
4
Sample Output
84
98
99
99

 */