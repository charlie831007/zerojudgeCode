import java.util.Scanner ;

public class RomeNumber {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in) ;
		while(keyboard.hasNext())
		{
			String input1 = keyboard.next() ;
			if(input1.equals("#"))
				break ;
			String input2 = keyboard.next() ;
			
			int num1 = 0 ;
			int num2 = 0 ;
			for(int a = 0 ; a < input1.length() ; a++)
			{
				switch(input1.charAt(a))
				{
				case 'M':
					num1 += 1000 ;
					break ;
				case 'D':
					num1 += 500 ;
					break ;
				case 'C':
					if((a+1) < input1.length())
					{
						if(input1.charAt(a+1) == 'M')
						{
							num1 += 900 ;
							a++ ;
						}
						else if(input1.charAt(a+1) == 'D')
						{
							num1 += 400 ;
							a++ ;
						}
						else
							num1 += 100 ;
					}
					else
						num1 += 100;
					break ;
				case 'L':
					num1 += 50 ;
					break ;
				case 'X':
					if((a+1) < input1.length())
					{
						if(input1.charAt(a+1) == 'C')
						{
							num1 += 90 ;
							a++ ;
						}
						else if(input1.charAt(a+1) == 'L')
						{
							num1 += 40 ;
							a++ ;
						}
						else
							num1 += 10 ;	
					}
					else
						num1 += 10 ;
					break ;
				case 'V':
					num1 += 5 ;
					break ;
				case 'I':
					if( (a+1) < input1.length())
					{
						if(input1.charAt(a+1) == 'X')
						{
							num1 += 9 ;
							a++ ;
						}
						else if(input1.charAt(a+1) == 'V')
						{
							num1 += 4 ;
							a++ ;
						}
						else
							num1 += 1 ;
					}
					else
						num1 += 1 ;
					break ;
				}	
			}
			for(int a = 0 ; a < input2.length() ; a++)
			{
				switch(input2.charAt(a))
				{
				case 'M':
					num2 += 1000 ;
					break ;
				case 'D':
					num2 += 500 ;
					break ;
				case 'C':
					if((a+1) < input2.length())
					{
						if(input2.charAt(a+1) == 'M')
						{
							num2 += 900 ;
							a++ ;
						}
						else if(input2.charAt(a+1) == 'D')
						{
							num2 += 400 ;
							a++ ;
					}
					else
						num2 += 100 ;	
					}
					else
						num2 += 100 ;
					break ;
				case 'L':
					num2 += 50 ;
					break ;
				case 'X':
					if((a+1) < input2.length())
					{
						if(input2.charAt(a+1) == 'C')
						{
							num2 += 90 ;
							a++ ;
						}
						else if(input2.charAt(a+1) == 'L')
						{
							num2 += 40 ;
							a++ ;
						}
						else
							num2 += 10 ;	
					}
					else
						num2 += 10 ;
					break ;
				case 'V':
					num2 += 5 ;
					break ;
				case 'I':
					if( (a+1) < input2.length())
					{
						if(input2.charAt(a+1) == 'X')
						{
							num2 += 9 ;
							a++ ;
						}
						else if(input2.charAt(a+1) == 'V')
						{
							num2 += 4 ;
							a++ ;
						}
						else
							num2 += 1 ;	
					}
					else
						num2 +=1 ;
					break ;
				}
			}
			
				int total = Math.abs((num1 - num2)) ;
				
				if(total == 0)
					System.out.println("ZERO") ;
				else
				{
					String romeTotal = "" ;
					while(total > 0)
					{
						if(total >= 1000)
						{
							romeTotal += "M" ;
							total -= 1000 ;
						}
						else if(total >= 900)
						{
							romeTotal += "CM" ;
							total -= 900 ;
						}
						else if(total >= 500)
						{
							romeTotal += "D" ;
							total -= 500 ;
						}
						else if(total >= 400)
						{
							romeTotal += "CD" ;
							total -= 400 ;
						}
						else if(total >= 100)
						{
							romeTotal += "C" ;
							total -= 100 ;
						}
						else if(total >= 90)
						{
							romeTotal += "XC" ;
							total -= 90 ;
						}
						else if(total >= 50)
						{
							romeTotal += "L" ;
							total -= 50 ;
						}
						else if(total >= 40)
						{
							romeTotal += "XL" ;
							total -= 40 ;
						}
						else if(total >= 10)
						{
							romeTotal += "X" ;
							total -= 10 ;
						}
						else if(total >= 9)
						{
							romeTotal += "IX" ;
							total -= 9 ;
						}
						else if(total >= 5)
						{
							romeTotal += "V" ;
							total -= 5 ;
						}
						else if(total >= 4)
						{
							romeTotal += "IV" ;
							total -= 4 ;
						}
						else
						{
							romeTotal += "I" ;
							total -= 1 ;
						}
					}
					System.out.println(romeTotal) ;
				}
		}
		keyboard.close() ;

	}

}
