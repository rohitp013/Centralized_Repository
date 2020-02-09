package Training;

public class Rohit {

	public void method() {
		System.out.println("Default Constructor");
	}
	public void method1(int a) {
		System.out.println("1 Parameterized Constructor");
	}
	public void method2(int a, int b) {
		this.method3(1, 2, 3);
		this.method();
		this.method1(10);
		this.method4(1, 2, 3, 4);
		System.out.println("2 Parameterized Constructor");
	}
	public void method3(int a,int b,int c) {
		System.out.println("3 Parametrized Constructor");
	}
	public void method4(int a, int b, int c, int d) {
		System.out.println("4 Parameterized Constructor");
	}

	public static void main(String[] args) {
		Rohit obj = new Rohit();
		obj.method2(1,2);
	}

}