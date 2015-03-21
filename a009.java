import java.util.Scanner ;

public class Decoder {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in) ;
		String input ;
		char convertInput ;
		while(keyboard.hasNext())
		{
			input = keyboard.nextLine() ;
			for(int a = 0 ; a < input.length() ; a++)
			{
				convertInput = (char)(input.charAt(a) - 7) ;
				System.out.print(convertInput) ;
			}
			System.out.println() ;
		}
	}
}
