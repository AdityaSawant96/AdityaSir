package arrayLogicalProgram;

public class FindTheSmallestElementInTheArray {

	public static void main(String[] args) {
int b[]= {12,90,78,56};
int min =b[0];
for(int i=1; i<b.length; i++)
{
	if(b[i]<min)
	{
		min=b[i];
	}
}
System.out.println(min);
	}

}
