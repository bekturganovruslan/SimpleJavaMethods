package myMethods;

public class SingleNumber{

	public static void main(String[] args){

		int[] num=new int[] {2,3,4,5,2,3,4,5,6}; 
        int count = 0;
        int result = 0;
       
        for(int i =0; i<num.length; i++) {
            count =0;
         
            for(int j=0; j<num.length; j++) {
                if(num[i]==num[j]) {
                    count++; //1,2
                }
            }if(count==1) {
                result = num[i];
            }
        }
       System.out.println(result);
        
    }
	
	}


