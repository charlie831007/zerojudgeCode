import java.util.Scanner ;

public class ElementSum {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in) ;
		
		int lineInput = keyboard.nextInt() ;
		while(lineInput > 0)
		{
			int max = 0 ;
			int sum = 0 ;
			int numInput = keyboard.nextInt() ;
			for(int i = 0 ; i < numInput ; i++)
			{
				int num = keyboard.nextInt() ;
				if(i == 0)
				{
					max = num ;
					sum += num ;
				}
				else if(sum < 0 && num > sum)
					sum = num ;
				else	
					sum += num ;
				if(sum > max)
					max = sum ;
			}
			System.out.println(max) ;
			lineInput-- ;
		}
		keyboard.close() ;
	}

}
