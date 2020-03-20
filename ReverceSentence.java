package myMethods;

public class ReverceSentence {
	
	public static void main(String[] args) {
		String word="I love Java";
		
		String reversed=reverse(word);
		System.out.println(reversed);
	}
	
	public static String reverse (String word) {
		
		if(word.isEmpty())
			return word;
		
		return reverse(word.substring(1))+word.charAt(0);
		
	}

	

}
