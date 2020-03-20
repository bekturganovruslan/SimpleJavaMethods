package myMethods;

public class ReverseString {
	public static void main(String[] args) {
		
	String word="Techtorial";
	for(int index=0, len=word.length(); index<len; ++index ) {
		System.out.print(word.charAt(index)+" ");
	}
	System.out.println();
	
	for(int index=word.length()-1;  index>=0; index-- ) {
		System.out.print(word.charAt(index)+" ");
	}

	}
}