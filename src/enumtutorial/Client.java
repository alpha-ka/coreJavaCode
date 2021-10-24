package enumtutorial;

public enum Client {
	PRIVATE("p"),BUSINESS("B");
	
	private final String text;
	
	Client(String text)
	{
		this.text=text;
	}
	
	public String toString()
	{
		return text;
	}

}
