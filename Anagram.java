package myMethods;

public class Anagram {
	
	public static boolean isAnagram(String s, String t) {
	    for(int i=0; i<s.length(); i++){
	      boolean notFound=true;
	      
	      for(int j=0; j<t.length(); j++){
	        if(s.charAt(i)==t.charAt(j)){
	         
	          notFound=false ;
	         
	          t=t.substring(0,j)+t.substring(j+1);
	        }
	      }
	      if(notFound){
	        return false;
	      }
	    }
	    return true;
	  }
	
	public static void main(String[] args) {
		
		 System.out.println(isAnagram("silent", "listen"));
	}


}
