package javalearning;

public class Arraytypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {1,2,3,4,5};
		//arr= new int[] {22,34,34};
		int[][]arr1= new int[][] {{1,2,3},{4,5,6}};
		arr1[0][0]=5;
		//arr[0]=4;
		System.out.println(arr1[0][0]);
		
		
	//	System.out.println(arr[0]);

		for(int i=0;i<5;i++)
		{
		System.out.println(arr[i]);
	}

}
}

