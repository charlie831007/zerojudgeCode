import java.util.Scanner ;

public class Algorithm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in) ;
		while(keyboard.hasNext())
		{
			int i = keyboard.nextInt() ;
			int j = keyboard.nextInt() ;
			int swap = 0 ;
			System.out.print(i + " " + j + " ") ;
			if(i > j)
			{
				swap = i ;
				i = j ;
				j = swap ;
			}
			
			int longestLength = 1 ;
			for(int a = i ; a <= j ; a++)
			{
				int cycleLength = 1 ;
				int input = a ;
				while(input != 1)
				{
					if(input % 2 != 0)
					{
						input = input * 3 + 1 ;
						cycleLength ++ ;
					}
					else
					{
						input = input / 2 ;
						cycleLength ++ ;
					} 
				}
				 
				if(cycleLength >= longestLength)
					longestLength = cycleLength ;
			}
			System.out.println(longestLength) ;
		}
		keyboard.close() ;
	}

}
