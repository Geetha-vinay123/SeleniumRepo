package week1Day4;

public class FindTypes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] ch = test.toCharArray();

		for (int i = 0; i <ch.length; i++)
		{
			if (Character.isLetter(ch[i]))
			{
				letter++;
			}
			if (Character.isDigit(ch[i]))
			{
				num++;
			}
			if (Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else 
			{
				specialChar++;
			
		}
		}
			
		System.out.println("The Letter  is occurred : " + letter + "times");
		System.out.println("The Space  is occurred : " + space + "times");
		System.out.println("The number  is occurred : " + num + "times");
		System.out.println("The specialCharacter  is occurred : " + specialChar + "times");
	}
	}




