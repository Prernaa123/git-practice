package interviewClass;
import java.util.Scanner;
public class PalindromeNumber {
	static int isPalindrome(int n)
	{
		int sum=0,rem=0,rev=0;
		int n1=n;
		while(n!=0)
		{
			rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		} 
		if(rev==n1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a plaindrome");
		}
		return rev;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	
	System.out.println(isPalindrome(n));
	}
}
	
	
//	int sum=0,rem=0;
//	int rev=0;
//	int n1=n;
//	while(n!=0)
//	{
//		rem=n%10;
//		rev = (rev*10)+rem;
//		n=n/10;
//	}
//	if(rev==n1)
//	{
//		System.out.println("Palindrome number");
//	}
//	else
//	{
//		System.out.println("No Palindrome number");
//	}
//	}
//
//}
	
	
