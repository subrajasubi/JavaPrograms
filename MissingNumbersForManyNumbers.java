package week1.day1;

public class MissingNumbersForManyNumbers {
	
		
	
	public static void main(String[] args) {
		int[] num = {1,2,3,4,6,7,9,11,13};
		for (int i = 0; i < num.length; i++) {
			if(num[i+1]!=num[i]+1) {
				System.out.println(num[i]+1);
				
			}
		}
	}
	
	
}
