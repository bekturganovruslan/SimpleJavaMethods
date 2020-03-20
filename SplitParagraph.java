package myMethods;

public class SplitParagraph {

	public static void main(String[] args) {
		
		String paragraph="The method split() splits a String into multiple "
				+ "Strings given the delimiter that separates them."
				+ " The returned object is an array which contains the "
				+ "split Strings. We can also pass a limit to the number "
				+ "of elements in the returned array. The method split() "
				+ "splits a String into multiple Strings given the delimiter"
				+ " that separates them.";
		
		 String[] words = paragraph.split(" "); 
		  
		 	for(int i=0;  words.length>i;  i++)
		 		if(words[i].length()==4 || words[i].length()==5 &&
		 					words[i].charAt(words[i].length()-1)=='.') {
		 			
		 			
		 			System.out.println(words[i]);
		 		}
		}

}
