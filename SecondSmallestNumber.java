package javaprograms;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("The Second Smallest number is : ");
		System.out.println(data[1]);

}
}