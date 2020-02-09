package Training;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int a, temp;
		int c = 0, b = 0;
		
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		System.out.println("Entered number is : " +a);
		temp = a;
		
		while (a>0) {
			
			b=a%10;  
		    a=a/10;  
		    c=c+(b*b*b);
		}
		if(temp==c)
			System.out.println("Entered number is Armstrong number");   
		    else
		    System.out.println("It is not an Armstrong number");
		S.close();
	}

}
