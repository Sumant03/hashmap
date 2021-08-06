
import java.io.*;
import java.util.*;

public class highestFrequency {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        char hi=str.charAt(0);
        hm.put(hi,1);
        
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            
            
            
            if(hm.containsKey(ch)){
                
                int val=hm.get(ch);
                hm.put(ch,val+1);
                
            }else{
                hm.put(ch,1);
            }
            
            if(hm.get(ch)>hm.get(hi)){
                hi=ch;
            }
            
        }
        System.out.println(hi);
    
        
        
        
        
        
    }
    

}
