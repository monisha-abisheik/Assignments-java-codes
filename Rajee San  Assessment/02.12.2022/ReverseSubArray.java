

import java.util.Arrays;
import java.util.Scanner;
public class ReverseSubArray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		int k=input.nextInt();
		for(int i=0;i<n;i+=k)
		{
			int left=i;//0 3
			int r=i + k - 1;//2 5
			int right=(r<n-1)?r:n-1;//2<7  5<7
		    while (left < right) { 
				int temp = array[left]; //1
				array[left] = array[right]; //3
				array[right] = temp; //1
				left++; 
				right--; 
			} 
		}for(int i=0;i<n;i++) {			System.out.print(array[i]+" ");}
		}

	}


