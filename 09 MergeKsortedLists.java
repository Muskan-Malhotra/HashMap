import java.io.*;
import java.util.*;

/**
 * Time Complexity:
The time complexity for this approach is O(nlogn) where n is the time to traverse the tree and logn for calling find() function for every node.

Space Complexity:
The space complexity for the function is proportional to the height of the tree due to the recursion stack. (//doubt)
 */

class MergeKSortedLists {
    
   public static class Pair implements Comparable<Pair>{
       int li;
       int di;
       int val;
       
       Pair(int li, int di, int val){
           this.li = li;   //list index
           this.di = di;   //data index
           this.val = val; 
       }
       
       public int compareTo(Pair o){
           return this.val - o.val;
       }
        
   }
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();

      // write your code here
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      
      for(int i=0;i<lists.size();i++){
          pq.add(new Pair(i,0,lists.get(i).get(0)));
      }
      while(pq.size()>0){
          
          Pair p = pq.remove();
          rv.add(p.val);
          p.di++;
          
          if(p.di<lists.get(p.li).size()){
              int val = lists.get(p.li).get(p.di);
              p.val = val;
              pq.add(new Pair(p.li,p.di,p.val));
          }
          
      }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}