package Training;

public class Day3 {
	public Day3() {
		this (1,2,3);
		System.out.println("Default Constructor");
	}
	public Day3(int a) {
		this();		
		System.out.println("1 Parameterized Constructor");
	}
	public Day3(int a, int b) {
		this (1,2,3,4);
		System.out.println("2 Parameterized Constructor");
	}
	public Day3(int x, int y, int z) {
		System.out.println("3 Parametrized Constructor");
	}
	public Day3(int a, int b, int c, int d) {
		this(1);
		System.out.println("4 Parameterized Constructor");
	}	
	public static void main(String[] args) {
		Day3 obj = new Day3(1,2);																																								
	}
}