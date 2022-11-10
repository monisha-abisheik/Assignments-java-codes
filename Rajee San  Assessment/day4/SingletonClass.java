package day4;

public class SingletonClass {

	
private static SingletonClass singleton=null;
private SingletonClass() {
	
}
public static  SingletonClass getInstance() {
	if(singleton==null)
	{
		singleton=new SingletonClass();
	}
	return singleton;
}
public static void main(String[] args) {
	SingletonClass s=SingletonClass.getInstance();
	}

}
