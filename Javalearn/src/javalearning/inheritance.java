package javalearning;

public class inheritance {
	public static void main(String s[])
	{
test2 t= new test2();
t.display2();
run t1= new run();
t1.display1();
t1.display2();

	
	}
	
	
}

class test2 
{
	test2(int x){
	
	
	}
	void display2() {
System.out.println("test2 is done");
  
 
	}
}

 class run extends test2
{
	 run(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	void display1() {
			System.out.println("Test is done");}
			void display3() {
				
		String x=78;
		System.out.println("value of x is "+x);
			
			
	
	
}

}