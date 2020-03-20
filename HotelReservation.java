package myMethods;

public class HotelReservation {
	
	public static void main(String[] args) {
		
		String[] reserv= {"David-Date:2-25-2019-1:15", "Erick-Date:-16-2020-3:10",
					     "Kevin-Date:10-20-2019-2:11", "Patel-Date:3-11-2020-12:00"};
		
		
		String [][] reservDetails=new String[reserv.length][];
		
		for(int i = 0; i<reserv.length; i++) {
			
			reservDetails[i]=reserv[i].split("-");
			
		}
		System.out.println(reservDetails[1][3]); 
		
	}

}
