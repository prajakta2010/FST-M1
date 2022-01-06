package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String> colors_hm=new HashMap<Integer,String>();
		colors_hm.put(1, "RED");
		colors_hm.put(2, "ORANGE");
		colors_hm.put(3, "GREEN");
		colors_hm.put(4, "PURPLE");
		colors_hm.put(5, "BLUE");
		colors_hm.remove(1);
		
		
		if(colors_hm.containsValue("GREEN"))
		{
			System.out.println("Color is present");
		}
		else
		{
			System.out.println("Color is not present");
		}
		
		System.out.println("Size of Map   "+colors_hm.size());
	}

}
