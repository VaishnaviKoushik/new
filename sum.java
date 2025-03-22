import java.util.*;
class sum
{
	static void fun()
	{
		System.out.println("This is a function");
	}	

	public static void main(String args[])
	{
		int a;	
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum:"+c);
		fun();

	}
}