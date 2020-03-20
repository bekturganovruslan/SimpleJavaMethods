package myMethods;

public class FirstUniqueChar {
	
	
	    
	    public int GetLetter(String str) {
	    int count = 0;
	    int result =0;
	    
	    for(int i =0; i<str.length(); i++) {
	        count =0;
	        
	        for(int j=0; j<str.length(); j++) {
	            if(str.charAt(i)==str.charAt(j)) {
	                count++;
	            }
	        }if(count==1) {
	            result =str.indexOf(str.charAt(i));
	            return  result;
	            
	        } 
	    }return -1;
	    }
	    
	    
	    public static void main(String[] args) {
	        FirstUniqueChar nb = new FirstUniqueChar();
	    System.out.println(nb.GetLetter("accountant"));
	    System.out.println();
	    }
}
