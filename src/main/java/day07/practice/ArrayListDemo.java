package day07.practice;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		

		System.out.println("Using ArrayList :" + numbers);
		
		
		HashSet<Integer> unique = new HashSet<Integer>(numbers);
		System.out.println("Using Hashset :" +unique);
	}

}
