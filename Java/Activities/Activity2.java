package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarray[]= {10, 77, 10, 54, -11, 10};
		result(numarray);
		}
	
	static boolean result(int[] numbers)
	{
		int length=numbers.length;
		int sum=0;
		for(int i=0;i<length;i++)
		{
			if(numbers[i]==10)
			{
				sum=sum+numbers[i];
			}
		}
		
		if(sum==30)
		{
			System.out.println("Sum of 10's in array is "+sum);
			return true;
		}
		return false;


	}

}
