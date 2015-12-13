import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Calculation {
	
	//運算子的優先順序
	public static int priority(String op)
	{
		if(op.equals("+") || op.equals("-"))
			return 1;
		else if(op.equals("*") || op.equals("/") || op.equals("%"))
			return 2;
		else
			return 0;
		
	}
	
	//中序轉後序
	public static LinkedList<String> toPostfix(String infix)
	{
		//放運算子的stack
		LinkedList<String> stack = new LinkedList<String>();
		//放postfix
		LinkedList<String> output = new LinkedList<String>();
		String toStack = "(";
		String toOutput = ")";
		
		for(String inputStr : infix.split(" "))
		{
			//若是'('就放進stack中
			if(inputStr.equals(toStack))
			{
				stack.add(inputStr);
				//System.out.println("stack add: " + inputStr);
			}
			else if("+-*/%".indexOf(inputStr) != -1)
			{
				//若stack最上層運算子的priority >= inputStr就pop out 直到priority < inputStr 或 stack空
				while(!stack.isEmpty() && priority(stack.getLast()) >= priority(inputStr))
				{
					output.add(stack.removeLast());
					//System.out.println("output add op: " + inputStr);
				}
				
				stack.add(inputStr);
				//System.out.println("stack add op: " + inputStr);
			}
			else if(inputStr.equals(toOutput))
			{
				//還沒遇到')'之前都pop out
				while(!stack.getLast().equals(toStack))
				{
					output.add(stack.removeLast());
					//System.out.println("output add op: " + inputStr);
				}
				
				//若遇到'('就delete掉
				stack.removeLast();
			}
			else
			{
				output.add(inputStr);
				//System.out.println("output add: " + inputStr);
			}
		}
		
		while(!stack.isEmpty())
			output.add(stack.removeLast());
		
		//System.out.println(output);
		return output;
	}
	
	public static int evaluate(LinkedList<String> postfix)
	{
		LinkedList<Integer> stack = new LinkedList<Integer>();
		Iterator<String> iterator = postfix.iterator();
		while(iterator.hasNext())
		{
			String inputStr = iterator.next().toString();
			
			if("+-*/%".indexOf(inputStr) != -1)
			{
				int v2 = stack.removeLast();
				int v1 = stack.removeLast();
				stack.add(calculate(inputStr, v1, v2));
			}
			else
			{
				stack.add(Integer.parseInt(inputStr));
			}
		}
		
		return stack.getLast();
	}
	
	public static int calculate(String op, int v1, int v2)
	{
		switch(op)
		{
		case "+":
			return v1 + v2;
		case "-":
			return v1 - v2;
		case "*":
			return v1 * v2;
		case "/":
			if(v2 == 0)
				throw new ArithmeticException("Can't be divided by zero");
			return v1 / v2;
		case "%":
			return v1 % v2;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		int output;
		
		while(keyboard.hasNext())
		{
			input = keyboard.nextLine();
			output = evaluate(toPostfix(input));
			System.out.println(output);
		}
		keyboard.close();
	}

}
