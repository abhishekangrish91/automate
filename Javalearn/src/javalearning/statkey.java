package javalearning;

public class statkey {
	
	static{
		
		System.out.println("Testting static block");
	}
	static int cube(int x) {
		return x*x*x;
	}
	public static void main(String s[])
	{
		
		System.out.println("main block");
		int result=statkey.cube(5);
		System.out.println("cube is "+result);
	}
	

}
