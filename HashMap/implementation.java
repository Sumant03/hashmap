import java.util.*;

public class implementation {
    public static void  main(String args[]){  
    HashMap<String,Integer> hm=new HashMap<>();
       System.out.println(hm);    

       hm.put("India",200);
       hm.put("China",190);
       hm.put("USA",190);

      System.out.println(hm); 
      System.out.println("India :"+hm.get("India"));
      System.out.println("India :"+hm.get("india"));  //null


      hm.put("India",300);
      System.out.println(hm);
}
}
