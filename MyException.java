package hotel;

public class MyException {
	
    private String hotelName;
    private String hotelAddress;
	
	private MyException(String hotelName,String hotelAddress)
	{
		this.hotelName=hotelName;
		this.hotelAddress=hotelAddress;
	}
	
	public MyException(String string) {
		// TODO Auto-generated constructor stub
	}

	private static final MyException INSTANCE = new MyException("CRESCENT","HUBLI");
	
	public static MyException getInstance()
	{
		return INSTANCE;
	}

}