import java.util.Scanner ;
import java.math.* ;

public class Factoring {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in) ;
		while(keyboard.hasNext())
		{
			double input = keyboard.nextDouble() ;
			int sqrtInput = (int)Math.sqrt(input) ;
			for(int a = 2 ; a <= sqrtInput ; a++)
			{
				int countNum = 0 ;
				while(input % a == 0)
				{
					input = input / a ;
					countNum++ ;
				}
				if(countNum == 1 && input ==1)
					System.out.println(a) ;
				else if(countNum ==1 && input > 1)
					System.out.print(a + " * ") ;
				else if(countNum > 1 && input == 1)
					System.out.println(a + "^" + countNum) ;
				else if(countNum > 1 && input > 1)
					System.out.print(a + "^" + countNum + " * ") ;
			}
			if(input > 1)
				System.out.println((int)input) ;
				
			
		}

	}

}
