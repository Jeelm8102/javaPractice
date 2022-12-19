//Command_line_argument
class Calc
{
public static void main(String args[])
	{
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[2]);
	String Opr=args[1];
	int c=0;
	if(Opr.equals("+"))
	{
	c = num1 + num2;
	}
	else if(Opr.equals("-"))
	{
	c = num1 - num2;
	}
	else if(Opr.equals("X"))
	{
	c = num1 * num2;
	}
	else if(Opr.equals("/"))
	{
	c = num1 / num2;
	}
	else 
	{
		System.out.println("Check the Operator");
	}
 System.out.println(c);
	}
}