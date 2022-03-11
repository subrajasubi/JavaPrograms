package javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingTwoLoops {

	public static void main(String[] args) {
		int array[]= {1,3,3,3,3,5,6,6,7,7,7};
		System.out.println("The Duplicate Numbers are : ");
		Set<Integer> duplicate = new LinkedHashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					duplicate.add(array[i]);
				}
			}
		}
    System.out.println(duplicate);
	}

}
