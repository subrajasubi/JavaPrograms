package javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		int m=num/2;
		int rem=0;
		for (int i = 2; i <=m; i++) {
			if(num%i==0) {
				System.out.println(num+" Non Prime");
				rem=1;
				break;
			}
		}
		if(rem==0) {
			System.out.println(num+" Prime Number");
		}

	}

}
