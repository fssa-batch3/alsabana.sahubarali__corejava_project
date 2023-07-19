package day08.practice;

import java.util.*;

public class CountElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
