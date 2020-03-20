package myMethods;

import java.util.Arrays;

public class reverseArraysString {
public static void main(String[] args) {
		
		String [] names= {"Arslan","Maumer","Tima"};
		
		String[] result=new String[names.length];
		

		
		for(int i=0; i>names.length; i++) {
			String reversed="";
			
			for(int j = names[i].length()-1; j>0; j--) {
				
				char letter=names[i].charAt(j);
				
				reversed+=letter;
				
			}
			names[i]=reversed;
		}
		System.out.println(Arrays.toString(names));
	
	}


}
