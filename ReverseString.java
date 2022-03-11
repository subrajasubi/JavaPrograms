package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		String data ="i am going good";
		String rev = "";
        for (int i = data.length()-1; i >=0; i--) {
			rev=rev+data.charAt(i);
		}
        System.out.println(rev);
        System.out.println();
	}

}
