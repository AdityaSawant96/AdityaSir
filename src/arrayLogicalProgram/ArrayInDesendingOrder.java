package arrayLogicalProgram;

public class ArrayInDesendingOrder {

	public static void main(String[] args) {
int b[]= {23,12,76,89};
for(int i=0; i<b.length; i++)
{
	for(int j=i+1; j<b.length; j++)
	{
		if(b[i]<b[j])
		{
			int temp =b[j];
			b[j]=b[i];
			b[i]=temp;
		}
	}
	System.out.println(b[i]);
	
}
	}

}
