package myMethods;

public class PrintNameReversed {
	
	public static void main(String[] args) {
		
		String name="Techtorial";
		
		int index=name.length()-1;
		
		while(index>=0) {
			System.out.println(name.charAt(index));
			--index;
		}
	
		
	}

}
