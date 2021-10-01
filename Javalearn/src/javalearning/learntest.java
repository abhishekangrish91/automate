package javalearning;

public class learntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
	int temp=0;
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+ " ");
		
	
	for(int j= arr.length; j<0;j--)
	{
		arr[i]=temp;
		temp=arr[j];
		arr[i]=arr[j];
		
	}
	System.out.println(arr[i]);
	}

	}
	

}
