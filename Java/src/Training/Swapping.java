package Training;

import java.util.Scanner;

public class Swapping { /* Swapping using Third Variable */
		
	public static void main(String[] args) 
	{
		int a; 
		int b;
		int c;
		
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		Scanner R = new Scanner(System.in);
		b = R.nextInt();
		System.out.println("Value of a is : " +a);
		System.out.println("Value of b is : " +b);		
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swapping");

		System.out.println("Value of a is : " +a);
		System.out.println("Value of b is : " +b);		
		S.close();
		R.close();
	}
}
