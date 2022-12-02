package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UnMatchCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();int len=0,len1=0;
        String s="";
       for(char c:s1.toCharArray()) {
    	   len++;
    	   }
       for(char c1:s1.toCharArray()) {
        	   len1++;
        	   }
     for(int i=0;i<len;i++) {
    	 for(int j=0;j<len1;j++) {
    		 if(s1.charAt(i)!=s2.charAt(j)) 
    		 {
    			 s+=s1.charAt(i);
    			 s+=s2.charAt(j);
    			
    		 }
    		 i++;
    	 }
     }
     System.out.println(s);
       }
	}


