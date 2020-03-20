package myMethods;

public class TreeLoop {
	public static void main(String[] args) {
		
	
	int num=30;
	String star="?";
	
	
	do {
		System.out.println(star);
		star=star+" ?";
		--num;
	}while(num>0);

}
}