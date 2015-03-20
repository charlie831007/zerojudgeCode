import java.util.Scanner ; 

public class PrimeNumber {
	
	private static int[] primeArray = new int[100000];
	private static int pNum = 3 ;
	
	public static void buildPrime(int buildMax)                            			
	{
		for(int i = 7 , j = 4 ; i <= buildMax ; i += j , j = 6-j)
		{
			if(isPrime(i))
			{
				primeArray[pNum] = i ;
				pNum+= 1 ;
			}
		}
	}

	public static boolean isPrime(int a)
	{
		for(int b = 0 ; b < pNum && (primeArray[b] * primeArray[b]) <= a ; b++)
			if(a % primeArray[b] == 0)
				return false ;
		return true ;
	}

	public static void main(String[] args) {
		primeArray[0] = 2 ;
		primeArray[1] = 3 ;
		primeArray[2] = 5 ;
				
		Scanner keyboard = new Scanner(System.in) ;
		buildPrime(46341) ;
		
		while(keyboard.hasNext())
		{
			int keyin = keyboard.nextInt() ;
			if(isPrime(keyin))
				System.out.println("質數") ;
			else
				System.out.println("非質數") ;
		}
		keyboard.close();

	}

}
