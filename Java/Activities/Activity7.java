package activities;

public class Activity7 {

	public static void main(String[] args) {
		
		MountainBike objMountainBike=new MountainBike(2,0,15);
		System.out.println(objMountainBike.bicycleDesc());
		objMountainBike.speedUp(30);
		objMountainBike.applyBrake(10);
		System.out.println(objMountainBike.bicycleDesc());

	}

}
