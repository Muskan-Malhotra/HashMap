import java.io.*;
import java.util.*;

/**
 * Time Complexity:
Add: The time complexity of this method is O(logn) same as the time complexity for adding in a priority queue as we are using the priority queue directly and adding the values into it.
Remove: The time complexity for remove is O(logn) as we have removed the elements from the priority queue and it takes O(logn) time to remove an element from the priority queue.
Peek: The time taken for peek is O(1) as we are just using the peek() method of priority queue.
Size: The time complexity for size is also O(1) as we are just returning the sum of sizes of both the queues and it takes O(1) time to calculate the size of priority queues using size() function.
Space Complexity:
The space complexity for all the methods is O(1) as we have not used any extra space for any method. We have taken two priority queues but they will not be counted in space complexity as it is not extra space. The question was to create a median priority queue and we have just done that using the two priority queues.
 */

 /**
  * Algo
  * size == sum of size of left+right
  * peek == if this.size== 0 -> Underflow; else if left.size>=right.size == peek of left; else right
  * remove: same as peek just change to remove
  * add: if right.size>0 and right.peek <= val --> insert in right; else insert in left; 
  ----> if left.size-right.size == 2 { if left.size>right.size --> right.add(left.remove())}{else{right.size()>left.size() --> left.add(right.remove()) }}
  */

class MedianPQ {

  public static class MedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    public void add(int val) {
      // write your code here
      if(right.size() >0 && right.peek() <= val){
          right.add(val);
      }
      else{
          left.add(val);
      }
      if(Math.abs(left.size()-right.size()) == 2){
          if(left.size()>right.size()){
              right.add(left.remove());
          }
          else{
              left.add(right.remove());
          }
      }
    }

    public int remove() {
      // write your code here
      if(this.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      else if(left.size()>=right.size()){
          return left.remove();
      }
      else{
          return right.remove();
      }
    }

    public int peek() {
      // write your code here
      if(this.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      else if(left.size()>=right.size()){
          return left.peek();
      }
      else{
          return right.peek();
      }
    }

    public int size() {
      // write your code here
      return left.size()+right.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MedianPriorityQueue qu = new MedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}

/**
 * 1. You are required to complete the code of our MedianPriorityQueue class. The class should mimic the behaviour of a PriorityQueue and give highest priority to median of it's data.
2. Here is the list of functions that you are supposed to complete
2.1. add -> Should accept new data.
2.2. remove -> Should remove and return median value, if available or print "Underflow" otherwise and return -1
2.3. peek -> Should return median value, if available or print "Underflow" otherwise and return -1
2.4. size -> Should return the number of elements available
3. Input and Output is managed for you.

Note -> If there are even number of elements in the MedianPriorityQueue, consider the smaller median as median value.
 */

 /**
  * Sample Input
add 10
add 20
add 30
add 40
peek
add 50
peek
remove
peek
remove
peek
remove
peek
remove
peek
quit
Sample Output
20
30
30
20
20
40
40
10
10
50
  */