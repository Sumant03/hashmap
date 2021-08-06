
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class run
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		
		
		for(int i=0;i<n;i++){
		    
		    
		    
		    int total=scn.nextInt();
		    int arr[]=new int[total];
		    
         //  System.out.println(arr.length);
		    for(int val=0;val<total;val++){
		        arr[val]=scn.nextInt();
		    }
		
		    int min=0,max=0;
		    int index=0;
		 
		 Arrays.sort(arr);   
		 min=arr[0];
		 max=arr[total-1];
		 
		 arr[total-1]=min;   
		   
          System.out.println(min);
		
		    int sum=0;
		     for(int val=0;val<arr.length;val++){
		        arr[val]=arr[val]/min;
                sum+=arr[val];
		    }
		    
		    
		    System.out.println(sum);
		}
		
	}
}
