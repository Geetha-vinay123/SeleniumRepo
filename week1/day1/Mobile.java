package week1.day1;

public class Mobile {
	
	public void makeCall()
	
	{	
	System.out.println("I want to make a call");
	
	}
	
	public void sendMsg()
	{
		System.out.println("I want to send message");
	}



public static void main(String[] args) {
	
	Mobile obj1=new Mobile();

	
	obj1.makeCall();
	obj1.sendMsg();

}
}