package Training;

import java.util.Scanner;
public class Class4 {                           //// (((((x1-x2)*x3)-x4)+x5)/x6)
	public int add(int a, int b) {
		int c = a+b;
		return c;}
	public int sub(int x, int y) {
		int z = x-y;
		return z;}
	public int mul(int p, int q) {
		int r = p*q;
		return r;}
	public int div(int a, int b) {
		int c = a/b;
		return c;}
	public static void main(String[] args) {   //// (((((x1-x2)*x3)-x4)+x5)/x6)
		Scanner s1 = new Scanner(System.in);
		int x1 = s1.nextInt();
		System.out.println("Value of x1: "+x1);
		int x2 = s1.nextInt();
		System.out.println("Value of x2: "+x2);
		int x3 = s1.nextInt();
		System.out.println("value of x3: "+x3);
		int x4 = s1.nextInt();
		System.out.println("value of x4: "+x4);
		int x5 = s1.nextInt();
		System.out.println("value of x5: "+x5);
		int x6 = s1.nextInt();
		System.out.println("value of x6: "+x6);
		Class4 obj = new Class4();
		int a = obj.sub(x1, x2);
		int b = obj.mul(a, x3);
		int c = obj.sub(b, x4);
		int d = obj.add(c, x5);
		int e = obj.div(d, x6);
		System.out.println("The Final Result is: "+e);
	}
} 