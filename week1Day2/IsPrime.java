package week1Day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int pn=97 ;
		
		for(int i = 2; i<=pn-1;i++) {
			
			if(pn%i == 0) {
				System.out.println("The given number "+pn+" is not a Prime number");
				break;
			}
			
			else if(i == pn-1) {
				System.out.println("The given number "+pn+" is a Prime number");
			}
			
		}
	}

}
