package activities;

public class CustomException extends Exception {

	private String message;
	
	CustomException(String custom)
	{
		this.message=custom;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
}
