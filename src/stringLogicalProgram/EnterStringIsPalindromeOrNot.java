package stringLogicalProgram;

public class EnterStringIsPalindromeOrNot {

	public static void main(String[] args) {
String abc="Madam";
String ac = abc.toLowerCase();
String rev="";

for(int i=0; i<ac.length(); i++)
{
	char ch=ac.charAt(i);
	rev=rev+ch;
}
System.out.println(rev);
if(ac.equals(rev))
		{
	System.out.println("String is Palindrome");
		}
else
{
	System.out.println("String is bnot Palindrome");
}
	}

}
