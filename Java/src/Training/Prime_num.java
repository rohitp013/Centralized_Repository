package Training;

import java.util.Scanner;

public class Prime_num {
	
	public static void main (String[] args) {
		
		 int num = 0, flag;
		 int i = 2;
		 Scanner S = new Scanner(System.in);
		 num = S.nextInt();
		 System.out.println("Entered number is: " +num);
		 
		 
		 for(int k=1; k<num;k++)
		 {
			 if(num%k == 0)
			 System.out.println("Prime Number");
			 else
			 System.out.println("Not Prime Number");
		 }
		 S.close();
		 
		}    
		
	}
