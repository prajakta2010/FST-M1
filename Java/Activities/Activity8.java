package activities;

public class Activity8 {

	public static void main(String[] args) {
		try
		{
			Activity8.exceptionTest("print the message1");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("print the message2");
			
		}
		catch(CustomException mae)
		{
			 System.out.println("Inside catch block: " + mae.getMessage());
		}

		

	}

	static void exceptionTest(String str) throws CustomException
	{
		if(str==null)
		{
			throw new CustomException("String value is null");
		}
		else
		{
			System.out.println(str);
		}
	}
}
