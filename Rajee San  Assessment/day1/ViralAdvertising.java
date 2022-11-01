package day1;

/*The day Number n=5
Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24*/

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in); 
			            int n = scanner.nextInt();
			            int shared  = 5,likes=0;
			            int totallikes = 0;
			            for (int i = 0; i < n; i++) {
			                likes = shared/2;
			                totallikes += likes;
			                shared = likes*3;
			            }
			            System.out.println(totallikes);
			        }
			    
}
	

