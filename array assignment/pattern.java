package arrayAssigment;


public class pattern {

	public static void main(String[] args) {
		int i,j;
	
		String s="PROGRAM";
	    char a[]=s.toCharArray();
	    for(i=0;i<a.length;i++)
	    {
	    	for(j=0;j<a.length;j++)
	    	{
	    		if(i==j||i+j==a.length-1)
	    		   System.out.print(a[j]);
	    		else
	    		System.out.print(" ");	    		  
	    	    
	    	}
	    System.out.println();
	}
	
}

}
