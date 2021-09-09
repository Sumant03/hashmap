import java.io.*;
import java.util.*;

public class KlargestEelement {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
     PriorityQueue<Integer> pq=new PriorityQueue<>();
     
     for(int i=0;i<k;i++){
         pq.add(arr[i]);
     }
     for(int i=k;i<arr.length;i++){
         
         if(arr[i]>pq.peek()){
             pq.remove();
             pq.add(arr[i]);
         }
     }
     
     for(int idx=0;idx<k;idx++){
         System.out.println(pq.remove());
     }
     
    }

}