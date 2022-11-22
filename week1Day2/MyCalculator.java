package week1Day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Calculator obj = new Calculator();
		System.out.println("The output of ADD method :" +obj.add(3, 5, 7));
		System.out.println("The output of SUB method :" +obj.sub(8, 3));
		System.out.println("The output of MUL method :" +obj.mul(3.14, 6.12));
		System.out.println("The output of DIV method :" +obj.divide(25.5f, 5.0f));
		
		
	}

}
