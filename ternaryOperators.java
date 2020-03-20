package myMethods;

public class ternaryOperators {
	public static void main(String[] args) {
		
		int x=5;
					//          true     false       
			System.out.println( x < 2  ?  x > 6 ? "first" : "second" : "third ");
			//                 	false	 true
			System.out.println( x < 2  ?  x > 4 ? "first" : "second" : "third ");
				//				false	  false		
			System.out.println( x < 4  ?  x > 7 ? "first" : "second" : "third ");
			//						     false		
			System.out.println( x < 2  ?  x > 4 ? "first" : "second" : "third ");
	}

}
