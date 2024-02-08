package generalProgram;

public class FibonacciSeries {
//0,1,1,2,3,5,8
	public static void main(String[] args) {
int a=0,b=1;
int num=5;
int c;
System.out.print(a+" ,"+b);
for(int i=1;i<=num; i++)
{
	c=a+b;
	a=b;
	b=c;
	System.out.print(", "+c);
}
	}

}
