package Training;

public class Student {

	int age;
	int roll_no;

	public void display() {

		System.out.println("Welcome to all of you");
	}

	public static void main(String[] args) 
	{
		Student deepak = new Student();
		deepak.age = 30;
		System.out.println(deepak.age);
		deepak.roll_no = 10;
		System.out.println(deepak.roll_no);
		deepak.display();
	}
}