package activities;

public class MountainBike extends Bicycle {

	int seatHeight=0;
	
	public MountainBike(int gears, int currentSpeed,int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
		// TODO Auto-generated constructor stub
	}

	public void setHeight(int newValue)
	{
	    seatHeight = newValue;
	}
	

	 public String bicycleDesc() {
	        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	    }  
}
