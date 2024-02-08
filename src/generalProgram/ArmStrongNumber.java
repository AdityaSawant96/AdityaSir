package generalProgram;

public class ArmStrongNumber {

	public static void main(String[] args) {
int b= 370;
int cube;
int sum=0;
int OriginalNum=b;
int rem;
while(b>0)
{
	rem=b%10;
	cube=rem*rem*rem;
	sum=sum+cube;
	b=b/10;
}
System.out.println(sum);
if(OriginalNum==sum)
{
	System.out.println("ArmsStrong Number");
}

else
{
	System.out.println(" Not ArmsStrong Number");

}
	}

}
