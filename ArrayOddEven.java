package myMethods;


public class ArrayOddEven {


    public static void main(String[] args) {
   
        int number[]=new int[]{34,56,78,23,789,45,23};
        for(int p=0;p<number.length;p++)
        {
        	if(number[p]%2==0)
            	System.out.println(number[p]+ " is Even number");
            else
                System.out.println( number[p]+" is odd umber");
        	}
    	}
}