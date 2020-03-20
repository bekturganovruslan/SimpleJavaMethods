package myMethods;
import java.util.Arrays;
public class sumOfArrays {
	public static int sumOfDigits(int number) {
		int sum = 0;
		
		for ( ;number!=0; number/=10) {
			sum += number%10;
		}
		
		return sum;
	}
	public static int productValue(int number) {
		
		int sum = 0;
		int mul = 1;
		for ( ;number!=0; number/=10) {
			sum += number%10;
			mul *= number%10;
		}
		
		return mul-sum;
	}
	
	public static int [] sumOfDigitsArray (int [] numbers) {
		
		int [] result = new int [numbers.length];
		
		for (int i=0; i<result.length; i++) {
			result[i] = sumOfDigits(numbers[i]);
		}
		
		return result;
	}
	
	

	
	
	
	
	public static void main(String[] args) {
		
		int number = 2356;
		
		int [] sumArray = {18,14,18,26};
		
		System.out.println(sumOfDigits(number));
		System.out.println(productValue(number));
		System.out.println(Arrays.toString(sumOfDigitsArray(sumArray)));
	}
}
