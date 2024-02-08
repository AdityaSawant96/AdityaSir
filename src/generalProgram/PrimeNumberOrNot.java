package generalProgram;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int num=23;
		int count=0;
for(int i=1; i<=num; i++)
{
	if(num%i==0)
	{
		count++;
	}
}
System.out.println(count);
if(count==2)
{
	System.out.println("Prime Number");
}
else
{
	System.out.println("Not A Prime Number");
}
	}

}
