package day10;

import java.util.Arrays;
import java.util.Scanner;

public class LastPositionValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int excessValue = 0;
		for (int i = 0; i < n; i++) {
			int pow = 1;
			excessValue += a[i];
			int temp = excessValue;

			while (pow <=temp) {
				pow *= 2;

			}
			a[i] = pow / 2;
			excessValue = temp - a[i];

		}
		System.out.println("ExcessValue in LastPosition:"+excessValue);
		System.out.print("MaxValueArray:");
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");}
	}
}
