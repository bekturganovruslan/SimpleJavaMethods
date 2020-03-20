package myMethods;

public class printOnlyChar {
	public static void main(String[] args) {
		
		
		String str2="Techtorial Academy 2020";
		String str=str2.toLowerCase();
		
		
		for(int i=0; i<str.length(); i++) {
			for(char c='a'; c<='z'; c++) {
				if(str.charAt(i)==c) {
					System.out.print(str.charAt(i));
				}
			}
		}
	}
}
	


