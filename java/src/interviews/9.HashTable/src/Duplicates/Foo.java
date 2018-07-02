package Duplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 1, 2, -3, -5, -6, -8, 0, 2, -3, 4, 6, 7, 1, 0, 0 };
		HashMap<Integer, Set<Set<Integer>>> hm = new HashMap<Integer, Set<Set<Integer>>>();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j)
					continue;
				if (hm.containsKey(array[i] + array[j])) {

					Set<Integer> index = new HashSet<Integer>();
					index.add(i);
					index.add(j);
					Set<Set<Integer>> set = hm.get(array[i] + array[j]);
					set.add(index);
					hm.put(array[i] + array[j], set);
				} else {
					Set<Integer> index = new HashSet<Integer>();
					index.add(i);
					index.add(j);
					Set<Set<Integer>> set = new HashSet<Set<Integer>>();
					set.add(index);
					hm.put(array[i] + array[j], set);
				}

			}
		}

//		 Set<Integer> set = hm.keySet();
//		 for (Integer i : set) {
//		 Set<Set<Integer>> setI = hm.get(i);
//		 for (Set<Integer> al : setI) {
//		 for (Integer j : al) {
//		 System.out.printf(" %2d ", j);
//		 }
//		 System.out.println();
//		 }
//		
//		 }

		Set<Set<Integer>> resultSet = new HashSet<Set<Integer>>();
		for (int i = 0; i < array.length; i++) {
			int targetInt = array[i] * -1;
			if (hm.containsKey(targetInt)) {
				Set<Set<Integer>> setSet = hm.get(targetInt);
				for (Set<Integer> set : setSet) {
					if (!set.contains(i)) {
						Set<Integer> newOne = new HashSet(set);
						newOne.add(i);
						resultSet.add(newOne);
					}
				}
			}
		}

		for (Set<Integer> set : resultSet ) {
			for (Integer a : set) {
				System.out.printf(" %3d ", array[a]);
			}

			System.out.println();

		}

		//
		// Set<HashMap<ArrayList<Integer>, ArrayList<Integer>>> set =
		// hm.keySet();
		// for (HashMap<ArrayList<Integer>, ArrayList<Integer>> h : set) {
		// Set<ArrayList<Integer>> al = h.keySet();
		// for (ArrayList<Integer> all : al) {
		// for (int i : all)
		// System.out.printf("%d ", i);
		// System.out.printf("\n");
		// }
		//
		// }
	}

}
