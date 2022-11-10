package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = input.next();
		StringBuilder sb1 = new StringBuilder();
		List l = new ArrayList();
		StringBuilder string= new StringBuilder(str);
		int count;
		for (int i = 0; i < string.length() - 1; i++) {
			count = 1;
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j) && string.charAt(i) != ' ') {
					count++;
					string.setCharAt(j, ' ');

				}

			}

			if (count == 1 && string.charAt(i) != ' ')

				System.out.println(string.charAt(i));

			else if (string.charAt(i) != ' ') {
				System.out.println(string.charAt(i));
				System.out.println(count);
			}

		}

		
	}
}
