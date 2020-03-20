package myMethods;

public class morseCode{
	
	public static String MorseCode(String word){

	    char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
	                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
	                  ',', '.', '?' };

	    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
	                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
	                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
	                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
	                "-----", "--..--", ".-.-.-", "..--.." };

	    char[] chars = word.toCharArray();

	    String str = "";
	    for (int i = 0; i < chars.length; i++){
	        for (int j = 0; j < english.length; j++){

	            if (english[j] == chars[i]){
	                str = str + morse[j] + " ";  
	            }
	        }
	    }
	    return str;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(MorseCode("gig"));
		
	}
	
	
	
}