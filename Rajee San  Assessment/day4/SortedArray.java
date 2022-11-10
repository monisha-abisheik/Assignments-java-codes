package day4;

import java.util.ArrayList;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		int[] a= {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
     int n=a.length,xor=0;
    for(int i=0;i<n;i++) {
    	xor=xor^a[i];
    }
	System.out.println(xor);
}
}
/* for(int i=0;i<n-1;i++) {
    	 
    		if((a[i]==a[i+1])&&(a[i]!=-1)&&(a[i+1]!=-1)) {
    			a[i]=-1;
    			a[i+1]=-1;
    		
    		}
    	 
    	if(a[i]!=-1)
    	{
    		System.out.println(a[i]);
    	}
     }*/