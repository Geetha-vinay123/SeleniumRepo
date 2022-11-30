package week2.Day3;

public class smartPhone extends androidPhone{
	
	//public void connectWhatsapp() 
		// TODO Auto-generated method stub
//System.out.println("Whatsapp is used to connect the people");
	//}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//smartPhone obj = new smartPhone();
		
		//obj.sendMsg();
		//obj.makeCall();
		//obj.saveContact();
		//obj.takeVideo();
		//obj.connectWhatsapp();
	
	//override concept
	
	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video can be taken in Smartphone");
		}
		
		public static void main(String[] args)
{
	smartPhone mobile =new smartPhone();
	
	mobile.takeVideo();
	
}	
		
		

	}


