package week4.day1.assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesUsingListAndSet {
	public static void main(String[] args) throws InterruptedException, IOException {
		int[] array = {1,12,22,1,34,12,56,22,78};
		int count=0;
		List<Integer> list = new ArrayList<Integer>();
		for (Integer each : array) {
			list.add(each);
		}
        System.out.println("The Duplicate numbers are : ");
        for (int j = 0; j < list.size(); j++) {
			for (int k = j+1; k < list.size(); k++) {
				if(list.get(j)==list.get(k)) {
					count++;
				}
			}
			
				if(count==1) 
					System.out.println(list.get(j));
					count=0;
				
			}
        Set<Integer>set=new LinkedHashSet<Integer>(list);
        System.out.println(set);
		}
		
		
		
		}

