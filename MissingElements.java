package javaprograms;

public class MissingElements {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,6,7};
		System.out.println("The Missing Number is ");
		for (int i = 1; i <= num.length; i++) {
			if(i!=num[i-1]) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
