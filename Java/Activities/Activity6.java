package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		plane.onboard("abc");
		plane.onboard("def");
		plane.onboard("ghi");
		System.out.println("Take Off Time  "+plane.takeOff());
		System.out.println("List of Passenger  "+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Landing time  "+plane.getLastTimeLanded());
		System.out.println("Afer Landing Name of Passenger  "+plane.getPassesngers());
		
	}

}
