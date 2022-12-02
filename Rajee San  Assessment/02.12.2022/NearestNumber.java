

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NearestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int average = sum / n;
		int min_diff = Integer.MAX_VALUE;
		int result = -1;

		for (int i = 0; i < n; i++) {
			int diff = a[i] - average;
			if (diff < 0) {
				diff *= -1;
			}

			if (diff < min_diff) {
				min_diff = diff;
				result = i;
			}
		}

		System.out.println("The element is: " + a[result]);
	}
}
