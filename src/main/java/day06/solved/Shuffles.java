package day06.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Shuffles {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("cse");
		list.add("mech");
		list.add("eee");
		System.out.println("before shuffle");
		System.out.println(list);
		System.out.println("after shuffle");
		Collections.shuffle(list);
		System.out.println(list);
	}
}
