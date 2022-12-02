package day10;

import java.util.Scanner;

public class PatternUseTernary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt(), first = 0, last = (2 * size) - 1, s = last, s1 = last - size + 1;
		int[][] a = new int[last][last];
		while (last > s / 2) {

			for (int i = first; i < last; i++) {
				for (int j = first; j < last; j++)
					a[i][j] = ((i == first || i == last - 1 || j == first || j == last - 1) ? size : s1);

			}

			first++;
			last--;
			size--;
			s1--;

		}
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}

}
