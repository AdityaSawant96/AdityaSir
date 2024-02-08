package arrayLogicalProgram;

public class PrintMaximumElementInTheArray {

	public static void main(String[] args) {

		int c[]= {12,90,89,100};
		int max=c[0];
		for(int i=1; i<c.length; i++)
		{
			if(c[i]>max)
			{
				max=c[i];
			}
		}
		System.out.println(max);
		
	}

}
