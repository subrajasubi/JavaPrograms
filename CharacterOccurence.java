package javaprograms;

public class CharacterOccurence {

	public static void main(String[] args) {
		String str = "welcome to automation";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='e') {
				count++;
				
			}
		}
		System.out.println("Occurence of e in "+str+" is "+count);

	}

}
