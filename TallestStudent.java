import java.util.Scanner;
public class TallestStudent
{
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the height of Student 1 : ");
	int height1 = scanner.nextInt();
	System.out.print("Enter the height of Student 2: ");
	int height2 = scanner.nextInt();
	System.out.print("Enter the height of Student 3 : ");
	int height3 = scanner.nextInt();
	int tallest=height1;
	if(height2>height1){
	tallest=height2;
	}
	if(height3>height1){
	tallest=height3;
	}
	System.out.println("Tallest:"+tallest);
	}
}