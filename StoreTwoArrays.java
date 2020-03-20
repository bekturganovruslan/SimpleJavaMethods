package myMethods;

import java.util.Arrays;

public class StoreTwoArrays {
	public static void main(String[] args) {
		
		int[] a= {2,4,5,67,8};
		int[] b= {5,4,56,7,8};
		
		int[] result=new int[a.length + b.length]; // result = 10
		
		for(int i=0; i<a.length; i++) {
			result[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			result[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(result));
		
	}

}
