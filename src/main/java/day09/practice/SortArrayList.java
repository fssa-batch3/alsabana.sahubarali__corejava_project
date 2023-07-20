package day09.practice;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList <Integer> n = new  ArrayList<Integer>();
       n.add(2);
       n.add(8);//1 8 9 12 45
       n.add(1);
       n.add(45);
       n.add(12);
       n.add(9);
       
       Collections.sort(n);
       System.out.println("Sorted list " + n );
       
	}

}
