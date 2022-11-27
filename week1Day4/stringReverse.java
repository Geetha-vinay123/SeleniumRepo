package week1Day4;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "geetha";
		char[]chars = name.toCharArray();
		for (int i=chars.length-1;i>=0;i--)
		{
			System.out.println(chars[i]);
		}

	}
 
}
