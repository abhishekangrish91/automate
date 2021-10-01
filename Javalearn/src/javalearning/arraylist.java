package javalearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arraylist {
	public static void main(String s[])
	{
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		Set<String> st= new HashSet<String>();
		st.add("Abhishek");
		st.add("Abhishek");
		st.add("Test duplicacy");
		
		
		
		Iterator<Integer>  itr= arr.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		Iterator<String>  itr1= st.iterator();
		while(itr1.hasNext()) {
		System.out.println(itr1.next());
		}
		
		//arr.remove(0);
		//System.out.println(itr.next());
		
	}
	

}
