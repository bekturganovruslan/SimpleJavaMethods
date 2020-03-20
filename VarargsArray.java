package myMethods;
public class VarargsArray {
	
	public void setNames (String... name ) {
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
}
	public static void main(String[] args) {
	VarargsArray va= new VarargsArray();
	
	String[] names= {"Erica", "Kate", "Sarah", "Patel"};
		
	va.setNames(names);
	
	va.setNames(new String[] {"John", "Tim"});
	
	
	}
}

