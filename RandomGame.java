package myMethods;

import java.util.Random;
import java.util.Random;
import java.util.Scanner;
public class RandomGame {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		
		String [] choise;
		
		System.out.print("Please enter, how many variants you will have: ");
		int var = in.nextInt();
		
		choise = new String [var];
		
		for (int a = 0; a <= var-1; a++ ) {
			System.out.print("Please enter variant " + (a+1) + " : ");
			String varW = in.next();
			choise [a] = varW;
			
		}
		
		int rand = ran.nextInt(var);
		System.out.println("Random selected variant is #"+ (rand+1) + " : " +choise[rand]);
		
	}
	
}
