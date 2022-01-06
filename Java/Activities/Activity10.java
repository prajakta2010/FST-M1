package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println("Size of HashSet   "+hs.size());
		hs.remove(3);
		hs.remove(4);
		if(hs.contains(4))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		System.out.println("Updated Set  "+hs);
	}

}
