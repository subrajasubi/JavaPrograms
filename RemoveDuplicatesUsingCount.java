package javaprograms;

public class RemoveDuplicatesUsingCount {

	public static void main(String[] args) {
		int array[]= {1,3,3,3,3,5,6,6,7,7,7};
        int count=0;
        System.out.println("The Duplicate numbers are : ");
        for (int j = 0; j < array.length; j++) {
			for (int k = j+1; k < array.length; k++) {
				if(array[j]==array[k]) {
					count++;
				}
			}
			
				if(count==1) 
					System.out.println(array[j]);
					count=0;
				
			}
		}

	}


