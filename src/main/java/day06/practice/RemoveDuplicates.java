package day06.practice;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		List<String> newList = new ArrayList<String>();
		for(int i=0;i<cityList.size();i++) {
			boolean check = true;
			for(int j=i;j<cityList.size();j++) {
				if(i!=j && (cityList.get(i).contains(cityList.get(j)))){
					check=false;
				}
			}
			if(check) {
				newList.add(cityList.get(i));
			}
		}
		System.out.println(newList);
	}

}
