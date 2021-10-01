package javalearning;


interface test{
	
	int rect(int x);
	
}


public class interfacetest implements test {
	public int rect(int x)
	{
		System.out.println("Test");
	//	int y=x*x*x;
		return x;
		
		
		
		
	}
	public static void main(String s[])
	{
		
		test t= new interfacetest();
		//t.rect(5);
	int y=	t.rect(5*5*5);
		System.out.println("cube is "+y);
		
	}

}

