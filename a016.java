import java.util.Scanner ;

public class Sudoku {

	public static String judge(int[][] a)
	{
		int[] num =new int[10] ;
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		
		for(int row = 0 ; row < 9 ; row++)
		{
			for(int col = 0 ; col < 9 ; col++)
			{
				num[a[row][col]] +=1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
			for(int i = 1 ; i < 10 ; i++)
				num[i] = 0 ;
		}
		
		for(int col = 0 ; col < 9 ; col++)
		{
			for(int row = 0 ; row < 9 ; row++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
			for(int i = 1 ; i < 10 ; i++)
				num[i] = 0 ;
		}
		
		for(int row = 0 ; row < 3 ; row++)
		{
			for(int col = 0 ; col < 3 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 0 ; row < 3 ; row++)
		{
			for(int col = 3 ; col < 6 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 0 ; row < 3 ; row++)
		{
			for(int col = 6 ; col < 9 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}	
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 3 ; row < 6 ; row++)
		{
			for(int col = 0 ; col < 3 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}	
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 3 ; row < 6 ; row++)
		{
			for(int col = 3 ; col < 6 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 3 ; row < 6 ; row++)
		{
			for(int col = 6 ; col < 9 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 6 ; row < 9 ; row++)
		{
			for(int col = 0 ; col < 3 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 6 ; row < 9 ; row++)
		{
			for(int col = 3 ; col < 6 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		for(int i = 1 ; i < 10 ; i++)
			num[i] = 0 ;
		for(int row = 6 ; row < 9 ; row++)
		{
			for(int col = 6 ; col < 9 ; col++)
			{
				num[a[row][col]] += 1 ;
				if(num[a[row][col]] > 1)
				{
					return("no") ;
				}
			}
		}
		
		return("yes") ;
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in) ;
		int[][] sudoku = new int[9][9] ;
		
		while(keyboard.hasNext())
		{
			for(int row = 0 ; row < 9 ; row++)
			{
				for(int col = 0 ; col < 9 ; col++)
				{
					sudoku[row][col] = keyboard.nextInt() ;
				}
			}
			
			System.out.println(judge(sudoku)) ;
		}
		keyboard.close() ;
	}
	
}
