package javaprograms;

public class OccurenceOfEachCharacter {

	public static void main(String[] args) {
		String str = "welcome to automation";
		for (int i = 0; i < str.length(); i++) {
			int count=0;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if(c==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(c+" occurs "+count+" times in "+str);
		}

	}
}