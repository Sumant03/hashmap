
import java.util.*;
  
  public class BejaminBells{
  
  public static void main(String[] args) {
    // write your code here  
    
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    
    
    
    for(int i=1;i*i<=n;i++){
    System.out.println(i*i); 
    }
    
     scn.close();
   }
  }