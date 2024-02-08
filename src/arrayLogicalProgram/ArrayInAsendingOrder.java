package arrayLogicalProgram;

public class ArrayInAsendingOrder {

	public static void main(String[] args) {
int a[]= {12,90,78,45,32};
for(int i=0; i<a.length; i++)
{
	for(int j=i+1; j<a.length; j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
		}
	}
	System.out.println(a[i]);
}
	}

}
