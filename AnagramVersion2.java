package myMethods;

import java.util.Arrays;

public class AnagramVersion2 {
	
	 public boolean isAnagram(String s, String t) {
	     int str1Length = s.length();
	     int str2Length = t.length();
	        if(str1Length != str2Length )
	        return false;
	        
	    char[] newCharArray1 = s.toLowerCase().toCharArray();
	    char[] newCharArray2 = t.toLowerCase().toCharArray();
	    Arrays.sort(newCharArray1);//
	    System.out.println(newCharArray1);
	    Arrays.sort(newCharArray2);
	    System.out.println(newCharArray2);
	    for(int i =0; i<newCharArray1.length; i++) {
	         //
	            if(newCharArray1[i] != newCharArray2[i])
	           //true
	                return false;
	          }// false
	            return true;
	      }
	  
	  public static void main(String[] args) {
		  AnagramVersion2 aa=new AnagramVersion2();
	      
	      System.out.println(aa.isAnagram("silent", "listen"));
	      
	}


}
