/*Q. Write a java program to accept 2 int from user as cmdline args print add,sub,mul,div of 
numbers use appropriate exception and handle them
*/

class expjava
{
 public static void main(String args[])
	{
		try
		{
			int a,b;
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			System.out.println("The addition is: " +(a+b));
			System.out.println("The subtraction is: " +(a-b));
			System.out.println("The multiplication is: " +(a*b));
			System.out.println("The division is: " +(a/b));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Provide correct arguments");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Integers Only");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 not possible");
		}
		finally
		{
			System.out.println("This is Finally Block");
		
		}
	}
}