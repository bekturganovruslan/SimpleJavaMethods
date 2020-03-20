package myMethods;

public class PriceList {
	public static void main(String[] args) {
		
		
       String [][] products={
							{"Apple", "Orange", "Kiwi", "Grapes"},
							{"Potatos", "Carrots", "Cabbages", "Cucumber"},
							{"Orange juise","Coke", "Water", "Pepsi"},
							};
		
		double [][] prices= {
							{1.99, 2.49, 0.69, 1.39, },
							{2.34, 6.4 ,  9.4, 3.5},
							{3.6,  4.6,   6.3, 6.7},
							};
	
		int [][] inventory= {
							{50,56,798,76},
							{56,89, 34,67},
							{87,45, 98,45},
							};
		
	System.out.println("Product name is "+products[0][0]+"\nprice "+prices[0][0]+"\nNumbers of pounds "+inventory[0][0]);
	System.out.println();
	System.out.println("Product name is "+products[2][2]+"\nprice "+prices[2][2]+"\nNumbers of  pieses "+inventory[2][2]);

	
	for(int a=0; a<products.length; a++) {
		for(int b=0; b<products[a].length; b++) {
			System.out.println("Product name is "+products[a][b]+"\nprice "+prices[a][b]+"\nInvemtory  "+inventory[a][b]+"\n");

		}
		
	}
	
	
	
	}

}
