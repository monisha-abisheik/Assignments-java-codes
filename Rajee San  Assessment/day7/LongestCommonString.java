package day7;

//input
//["flower","flow","flight"]

//output
//fl 2

public class LongestCommonString {
	


		
			public static String longestCommonPrefix(String[] string) {
				if (string.length == 0) 
					return " ";
				String prefix = string[0];
				for (int i = 1; i < string.length; i++) {
					while (string[i].indexOf(prefix) != 0) {
						prefix = prefix.substring(0, prefix.length() - 1);
						
						if (prefix.isEmpty()) 
							return "";
						
					}
					
				}
				
				return prefix;
			}
		public static void main(String[] args) {
		String[] string= {"Flower","Flow","Flight"};
	            String longestCommonString=longestCommonPrefix(string);
	            System.out.println(longestCommonString+"-"+longestCommonString.length());
		}
	}





