package myMethods;

public class LeapYear {
	
	public String LeapYear(int year) {
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return "Leap Year";
				}
				return "Not Leap Year";			
			}
			return "Leap Year";
	}else{
		return "Not Leap";
	}
		
		}

public static void main(String[] args) {
	
	LeapYear ly=new LeapYear();
	
	
	
	System.out.println(ly.LeapYear(1900));
	
}
}
