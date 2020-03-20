package myMethods;

public class FibonacciExample1{  
public static void main(String args[])  {    
	
	int count2=0;
 
	int n1=0, n2=1, n3, i , count=45;    
	System.out.print(n1+" "+n2);//printing 0 and 1    
    count2++;
	 for(i=2; i<count; ++i)   {    
	
		 n3=n1+n2;    
	  System.out.print(" "+n3); 
	  n1=n2;    
	  n2=n3;  
	 
	 }    
	 System.out.println(" Times "+count2);
	  
	} 
}  
