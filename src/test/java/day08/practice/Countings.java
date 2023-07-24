package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

 class Countings {
	
	@Test
	
 void CountElement() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = scanner.nextLine();

		String[] names = input.split(",");
		  Map<String, Integer> nameCountMap = new HashMap<>();
		
		for(String str : names) {
			if(nameCountMap.containsKey(str)) {
				nameCountMap.put(str, nameCountMap.get(str) + 1);
			}else {
				  nameCountMap.put(str, 1);
			}
		}
		
		  for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }

	}

}
