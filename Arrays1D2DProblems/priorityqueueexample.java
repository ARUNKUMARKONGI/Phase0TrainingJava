package Arrays1D2DProblems;

import java.util.*;
public class priorityqueueexample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++) pq.add(s.nextInt());
        while(!pq.isEmpty()) System.out.print(pq.poll()+" ");
    }
}
/* 
 priority queue is a data structure that operates similar to a regular queue or
  stack data structure, but with an added feature: each element in a priority queue
   has a "priority" associated with it. 
   Elements with higher priority are served before elements with lower priority.   

min heap: the element with the lowest value has the highest priority and is served first.
max heap: the element with the highest value has the highest priority and is served first.
 
  PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
  this will create a max-heap priority queue for integers.
*/