package javaprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int sum=0;
		int rem;
		int orgNum = input;
		while(input>0) {
			rem=input%10;
			sum=sum+(rem*rem*rem);
			input=input/10;
		}
		if(orgNum==sum) {
			System.out.println(sum+"  Armstrong Number");
		}
		else {
			System.out.println(sum+" Not Armstrong");
		}

	}

}
