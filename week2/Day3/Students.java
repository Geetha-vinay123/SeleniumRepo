package week2.Day3;

public class Students {

	// To get Students ID
	public void getstudentinfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("The Student Id is " + id);
	}

	// To get Students Id and Name
	public void getstudentinfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("The Student Id is " + id + " and the student name is " + name);
	}

	// To get Students Email and Phonenumber
	public void getstudentinfo(String email, long phonenumber) {
		// TODO Auto-generated method stub
		System.out.println("The email id is " + email + " and the phonenumber is " + phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students();
		stud.getstudentinfo(12345);
		stud.getstudentinfo(12345, "Geetha");
		stud.getstudentinfo("geetha86.ece@gmail.com", 1234567893);

	}

}
