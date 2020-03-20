package myMethods;

import java.util.Arrays;

public class SortingArraysNumber {
	
	public static void main(String[] args) {
	    int[] arr = new int[] {9,8,78,9,5,3,};

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	       
	        	int temp = 0;
	            
 	        	if (arr[i] > arr[j]) {
	               
	        		temp = arr[i];
	                
	        		arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	    	}
	    System.out.println(Arrays.toString(arr));
	    
	}

}

