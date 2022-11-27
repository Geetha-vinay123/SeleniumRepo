package week1Day4;

public class Charoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		int count = 0;
		char[] ch = str.toCharArray();
		int length = ch.length;
		char ch1 = 'e';

		for (int i = 0; i <= length-1; i++)

		{
			if (ch[i] == ch1)

			{
				count++;

			}
		}

		System.out.println("The Letter e is occurred : " + count + "times");

	}

}