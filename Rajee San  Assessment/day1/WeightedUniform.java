package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
/*
input String=abccddde
No of Queries=6
Queries=1 3 12 5 9 10*/
public class WeightedUniform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string" + ":");
		String s = sc.next();
		List<Integer> queries = new ArrayList<>();
		List<String> answer = new ArrayList<>();

		System.out.println("Enetr the number:");
		int n = sc.nextInt();
		System.out.println("Enter the queries:");
		for (int i = 0; i < n; i++) {
			queries.add(sc.nextInt());
		}

		int count = 0, j = 1;
		Map<Character, Integer> m1 = new HashMap<>();
		for (char i = 'a'; i <= 'z'; i++) {
			m1.put(i, j);
			j++;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {

			Integer val = map.get(c);
			map.put(c, (val == null) ? 1 : val + 1);

		}
		System.out.println(map);
		List<Integer> l = new ArrayList<>();
		for (char key : m1.keySet()) {
			if (map.containsKey(key)) {
				int value = map.get(key);
				while (value != 0) {

					l.add(m1.get(key) * value);
					value--;
				}
			}

		}

		System.out.println(l);
		for (int tempList : queries)
			answer.add(l.contains(tempList) ? "Yes" : "No");
		Iterator<String> itr = answer.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	
}

