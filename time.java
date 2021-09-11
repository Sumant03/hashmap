import java.util.*;
public class time {
 
          
      
      public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
          int N=scn.nextInt();
          int K=scn.nextInt();
          
          
          int[] arr=new int[N];

          for(int i=0;i<N;i++){
              arr[i]=scn.nextInt();
          }

          for(int i=0;i<K;i++){
              int lo=scn.nextInt();
              int hi=scn.nextInt();

              getValue(arr,lo,hi);
          }
    }

    public static void getValue(int[] arr,int lo,int hi){
        int val=0;

        for(int idx=lo;idx<=hi;idx++){
            val+=arr[idx];
        }
        System.out.println(val);
    }

}

