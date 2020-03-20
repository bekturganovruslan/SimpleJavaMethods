package myMethods;

import java.util.Arrays;

public class Longestpalindrome {
	
	public static void main(String[] args) {
		
		String pal="kayak racecar civic madam rotator level";
		
		String[] words=pal.split(" ");
		
		int length[]=new int[words.length]; 
		
		int index=0;
		for(String  word : words) {
			length[index]=word.length();
			index++;
			
		}
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(length));
		Arrays.sort(length);
		System.out.println(length[length.length-1]);
		
		
		int largLength=length[length.length-1];
		
		for(String word : words) {
			if(word.length()==largLength) {
				System.out.println(word);
			}
		}
	}

}
