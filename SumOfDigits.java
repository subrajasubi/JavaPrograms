package javaprograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 15496;
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digit is "+sum);

	}

}
