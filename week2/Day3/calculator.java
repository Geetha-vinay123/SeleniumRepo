package week2.Day3;

public class calculator {
	
	public void add(int a ,int b) 
	{
		System.out.println(a+b);
	}
	
	public int add(int x,int y,int z)
	{
	return x+y+z;
	}
	
	public double sub(double a, double b) 
	
	{ return(a-b);
	
	}
	
	public void sub(int c , int d)
	
	{
		System.out.println(c-d);
	}
	
	public void mul(int a, double b) {
		System.out.println(a*b);
	}
	
	public double mul(double a, double b)
	{
		return(a*b);

	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 calculator obj=new calculator();
 int add =obj.add(5, 9, 3);
 System.out.println(add);
 obj.add(12, 43);
 System.out.println(add);
 double sub= obj.sub(5.0, 3.0);
 System.out.println(sub);
 obj.sub(8, 2.3);
 obj.mul(5, 2.1);
 double mul = obj.mul(5.0, 3.0);
		 System.out.println(mul);
 
 
 
	}

}
