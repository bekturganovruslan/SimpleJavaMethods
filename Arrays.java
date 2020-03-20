package myMethods;

public class Arrays {
	
	public static  int findLargest(int[] numbers) {
		int max=numbers[0];
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		return max;
	}
	
	
	
	
	public static int findMissing(int[] numbers) {
		int max=findLargest(numbers);
		int expectedSum=max*(max+1)/2;
		int actualSum=0;
		for(int i=0; i<numbers.length; i++) {
			actualSum+=numbers[i];
		}
		return expectedSum-actualSum;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int num [] = {1,2,4,5,6,7};

		System.out.println(findMissing(num));
		
	}

}
