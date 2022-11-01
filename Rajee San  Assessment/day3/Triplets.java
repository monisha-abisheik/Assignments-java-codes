package assessment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Triplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Eneter the number:");
	     int n=sc.nextInt();
	     int[] a=new int[n];
	     System.out.println("Enter numbers:");
	     for(int i=0;i<n;i++) {
	    	 a[i]=sc.nextInt();
	     }
	    
	     int c[]=new int[3];

	     for(int i=0;i<n-2;i++) {
		     for(int j=i+1;j<n-1;j++) {
			     for(int k=j+1;k<n;k++) {
			    	 if(a[i]+a[j]+a[k]==0) {
                       System.out.println(a[i]+" "+a[j]+" "+a[k]);
			    	 }
			     }
 
		     }
	 
	 
      
      

	}
}
}