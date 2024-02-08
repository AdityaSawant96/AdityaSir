package arrayLogicalProgram;

public class PrintStringElementInArrayInAsendingOrder {

	public static void main(String[] args) {
String b[]= {"volleyball","football","cricket","ruby"};
for(int i=0; i<b.length; i++)
{
	for(int j=i+1;j<b.length; j++)
	{
		if(b[j].compareTo(b[i])<0)
		{
			String temp=b[j];
			b[j]=b[i];
			b[i]=temp;
		}
	}
	System.out.println(b[i]);
}
	}

}
