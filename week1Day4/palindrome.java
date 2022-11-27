package week1Day4;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "madam";
		String rev = "";
		char[] chars = str1.toCharArray();

		for (int i = chars.length-1; i >=0; i--)
		{
			rev = rev + chars[i];
		}

				if (rev.equals(str1)) 
				{
					System.out.println("The given name is palindrome");
					
				}else
				
				{
					System.out.println("The given name is not a Palimdrome");

				}
		}

	}


