package arrayLogicalProgram;

public class DuplicateElementsInTHeArray {

	public static void main(String[] args) {
int b[]= {12,78,90,43,42,78};
for(int i=0; i<b.length; i++)
{
	for(int j=i+1; j<b.length; j++)
	{
		if(b[i]==b[j])
		{
			System.out.println(b[i]);
			
		}
	}
}
System.out.println("Duplicate Element is There");
	}

}
