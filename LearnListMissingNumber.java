package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnListMissingNumber {

	public static void main(String[] args) {
	int[] num = {1,2,3,4,6,8,10};
	List<Integer> li = new ArrayList<Integer>();
	for (Integer integer : num) {
          li.add(integer);
	}
	for (int i = 0; i < li.size()-1; i++) {
		if(li.get(i)+1!=li.get(i+1)) {
			System.out.println(li.get(i)+1);
		}
	}
	}

}
