package Training;

import java.util.Scanner;

public class Swapping_1 { /* Swapping without using Third Variable */
		
		private int b;
		private int a;
			
		public static void main(String[] args) 
		{
			int a; 
			int b;
			
			Scanner S = new Scanner(System.in);
			a = S.nextInt();
			
			Scanner R = new Scanner(System.in);
			b = R.nextInt();
			
			System.out.println("Value of a is : " +a);
			System.out.println("Value of b is : " +b);		
			
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.println("After Swapping");

			System.out.println("Value of a is : " +a);
			System.out.println("Value of b is : " +b);		
					
		}
}