import java.util.Scanner ;

public class Matrix {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in) ;
	
		while(keyboard.hasNext())
		{
			int row = keyboard.nextInt() ;
			int column = keyboard.nextInt() ;
			int[][] arr = new int[row][column] ;
			for(int i = 0 ; i < row ; i++)
			{
				for(int j = 0 ; j < column ; j++)
				{
					arr[i][j] = keyboard.nextInt() ;
				}
			}
			
			for(int j = 0 ; j < column ; j++)
			{
				for(int i = 0 ; i < row ; i++)
				{
					System.out.print(arr[i][j]) ;
					System.out.print(" ") ;
				}
				System.out.println() ;
			}
			
			
		}
		
		keyboard.close() ;
	}

}
