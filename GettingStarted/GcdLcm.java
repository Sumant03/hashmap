
import java.util.*;
    
    public class GcdLcm{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn=new Scanner(System.in);
      int num1=scn.nextInt();
      int num2=scn.nextInt();
      
      int n1=num1;
      int n2=num2;
      
      while(n1%n2!=0){
          int rem=n1%n2;
          n1=n2;
          n2=rem;
          
      }
      int gcd=n2;
      
      System.out.println(gcd);
      
      
      int lcm=(num1*num2)/gcd;
          
      System.out.println(lcm);
      
      
      scn.close();
     }
    }