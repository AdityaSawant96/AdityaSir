package generalProgram;

public class CheckGivenNumbrerIsPalindromeNumberOrNot {

	public static void main(String[] args) {
int a=727;
int reverse=0;
int OriginalNumber=a;
int rem;
while(a>0)
{
	rem=a%10;
	reverse=reverse*10+rem;
	a=a/10;
}
System.out.println(reverse);
if(OriginalNumber==reverse)
{
	System.out.println("Palindrome Number ");
}
else
{
	System.out.println("Not A Palindrome Number");
}
	}

}
