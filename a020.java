import java.util.Scanner ;

public class IDCard {
	
	public static int sum ;
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in) ;
		
		while(keyboard.hasNext())
		{
			String id = keyboard.next() ;
			sum = 0 ;
			
			if(countSum(id) % 10 == 0)
			{
				System.out.println("real") ;					
			}
			else
			{
				System.out.println("fake") ;
			}
		}
	}
	
	public static int countSum(String inputID)
	{
		switch (inputID.charAt(0))
		{
			case 'A' :
				sum += 1 ;
				break ;
			case 'B' :
				sum += 1 + 1*9 ;
				break ;
			case 'C' :
				sum += 1 + 2*9 ;
				break ;
			case 'D' :
				sum += 1 + 3*9 ;
				break ;
			case 'E' :
				sum += 1 + 4*9 ;
				break ;
			case 'F' :
				sum += 1 + 5*9 ;
				break ;
			case 'G' :
				sum += 1 + 6*9 ;
				break ;
			case 'H' :
				sum += 1 + 7*9 ;
				break ;
			case 'I' :
				sum += 3 + 4*9 ;
				break ;
			case 'J' :
				sum += 1 + 8*9 ;
				break ;
			case 'K' :
				sum += 1 + 9*9 ;
				break ;
			case 'L' :
				sum += 2 ;
				break ;
			case 'M' :
				sum += 2 + 1*9 ;
				break ;
			case 'N' :
				sum += 2 + 2*9 ;
				break ;
			case 'O' :
				sum += 3 + 5*9 ;
				break ;
			case 'P' :
				sum += 2 + 3*9 ;
				break ;
			case 'Q' :
				sum += 2 + 4*9 ;
				break ;
			case 'R' :
				sum += 2 + 5*9 ;
				break ;
			case 'S' :
				sum += 2 + 6*9 ;
				break ;
			case 'T' :
				sum += 2 + 7*9 ;
				break ;
			case 'U' :
				sum += 2 + 8*9 ;
				break ;
			case 'V' :
				sum += 2 + 9*9 ;
				break ;
			case 'W' :
				sum += 3 + 2*9 ;
				break ;
			case 'X' :
				sum += 3 ;
				break ;
			case 'Y' :
				sum += 3 + 1*9 ;
				break ;
			case 'Z' :
				sum += 3 + 3*9 ;
				break ;
			default :
				System.out.println("Not a letter.") ;
				System.exit(0) ;		
		}
		
		for(int i = 1 ; i < 10 ; i++)
		{
			Character ch = inputID.charAt(i) ;
			if(i < 9)
			{
				sum += Character.getNumericValue(ch) * (9 - i) ;
			}
			else
			{
				sum += Character.getNumericValue(ch) ;
			}
		}
		
		return sum ;
	}

}
