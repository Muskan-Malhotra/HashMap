

import java.util.*;

class Heap {
  // public static void main(String[] args) throws Exception {
  //   PriorityQueue< Integer> pq = new PriorityQueue< >();
  //   int[] ranks = {22, 99, 3, 11, 88, 4, 1};
  //   for (int val : ranks) {
  //     pq.add(val);
  //   }
  //   while (pq.size() > 0) {
  //     System.out.println(pq.peek());
  //     pq.remove();
  //   }
  // }

  /// High Priority given to the larger element
  public static void main(String[] args) throws Exception {
    PriorityQueue< Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int[] ranks = {22, 99, 3, 11, 88, 4, 1};
    for (int val : ranks) {
      pq.add(val);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}