package day2;
//String is immutable? 
 

public class StrImmutable {

	public static void main(String[] args) {
		String s = "zoho school";
		String s1 = "zoho school";
		System.out.println(s);
		System.out.println(s1);
         s1.concat("for graduate studies");
        String s2=s1;
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
