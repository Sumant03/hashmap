import java.util.*;
public class priorityQueue {
    
public static void main(String args[]){
    // PriorityQueue<Integer> pq=new PriorityQueue<>();
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //for max priority
    pq.add(10);
    System.out.println(pq);
    pq.add(20);
    System.out.println(pq);
    pq.add(30);
    System.out.println(pq);
    pq.add(100);
    System.out.println(pq);
    pq.add(-10);

    System.out.println(pq);
    
   System.out.println("Peek"+pq.peek());
   System.out.println("Size"+pq.size());

    while(pq.size()>0){
        System.out.println(pq.remove());
    }
}

}
