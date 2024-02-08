package stringLogicalProgram;

public class PrintYourName5TimesUsingAllTypesOfLoop1 {

	public static void main(String[] args) {
String abc ="Aditya P Sawant";
int count=0;
int count1=0;
while(count<5)
{
	System.out.println(abc);
	count++;
}
System.out.println(".............#..........");
do
{
	System.out.println(abc);
	count1++;
}while(count1<5);
System.out.println("......#...............");
for(int i=0; i<5; i++)
{
	System.out.println(abc);
}
	}

}
