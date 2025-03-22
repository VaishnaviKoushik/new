import java.util.*;
public class palindrome{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int original=num;
	int rev=0;
	while(num!=0){
		int rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		}
	if(original==rev){
		System.out.println("It is Palindrome");
	}else{
 		System.out.println("Not a palindrome");
	}
     }
}
	
 

