package gambler;

import java.util.Scanner;
import java.util.random;

public class gambling_uc3 {

	public static void main(String[] args) {
		
		int IS_WIN = 1;
		int val1=0;
		     
		
		
		    Scanner scanner = new scanner(System.in); 
			System.out.println("enter the amount");
		    
			String amount = scanner.nextLine();
			System.out.println("amount :" + amount);

			val1 = amount;
			initial_amount = amount;
			
			double winCheck == Math.floor(Math.random() * 10) % 2;
			if (winCheck == IS_WIN)
			{
				System.out.println("gambler has won and the current amount is:" + val1);
				(val1++);
			}
			else
			{
				System.out.println("gambler has lost and the current amount is:" + val1);
				(val1--);
			}
	
            if(initial_amount < val1);
            {
            	System.out.println("gamblre is lost $50");
            }
            else
            {
            	System.out.println("gamblre is won $50");
            }
      Scanner.close(); 
	}

}
