package myMethods;

public class rotateArray {
	

		  public static int[] rotateArray(int[] nums, int k ){

		        int last, start;
		        for (int i = 0; i < k; i++) {
		            last = nums[nums.length - 1];
		            for (int j = 0; j < nums.length; j++) {
		                start = nums[j];
		                nums[j] = last;
		                last = start;
		            }
		            
		        } 
		        return nums;
		    }
		  
		  public static void main(String[] args) {
			  
		
		}
		    
		  }
		  
		  


