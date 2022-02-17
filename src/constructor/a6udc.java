package constructor;
//user defined consructor from same class
//here a6udc() is user defined constructor
public class a6udc {
	String NAME;
	int rollno;
	char grade;

	a6udc() {
		NAME = "akshay";
		rollno = 58;
		grade = 'A';
	}

	void info() {
		String studentname = NAME;
		int Rollno = rollno;
		char Grade = grade;
		System.out.println("Name of the student:" + studentname);
		System.out.println("Roll no:" + Rollno);
		System.out.println("Grade:" + Grade);
	}

	public static void main(String[] args) {

		a6udc a6 = new a6udc();
		a6.info();

	}

}