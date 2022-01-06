package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		
		ArrayList<String> myList =new ArrayList<String>();
		myList.add("Ram");
		myList.add("Shyam");
		myList.add("Seeta");
		myList.add("krishn");
		myList.add("Balram");
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		System.out.println(myList.get(2));
		if(myList.contains("Balram"))
		{
			System.out.println("Name is present");
		}
		else
		{
			System.out.println("Name is not present");
		}
		
		System.out.println("Size of array  "+myList.size());
		myList.remove(2);
		System.out.println("Size of array after removing "+myList.size());
	}

}
