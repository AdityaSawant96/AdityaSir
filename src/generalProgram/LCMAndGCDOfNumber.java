package generalProgram;

public class LCMAndGCDOfNumber {

	public static void main(String[] args) {
int a=20, b=10;
int gcd=1;

for(int i=1 ; i<=a &&i<=b; i++ )
{
	if(a%i==0 && b%i==0)
	{
		gcd=i;
	}
	
}
System.out.println(gcd);
int lcm=a*b/gcd;
System.out.println(lcm);
	}

}
