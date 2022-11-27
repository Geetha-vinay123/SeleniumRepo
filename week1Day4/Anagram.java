package week1Day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		int a = text1.length();
		int b = text2.length();
		if (a==b)
		{
			char[]ch1=text1.toCharArray();
			char[]ch2=text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			Boolean equals = Arrays.equals(ch1,ch2);
			if(equals)
			{
				System.out.println("The values are matching in both the arrays.");
			}else
			{
				System.out.println("The values are not matching in both the arrays.");
			}
		}

	}

}
