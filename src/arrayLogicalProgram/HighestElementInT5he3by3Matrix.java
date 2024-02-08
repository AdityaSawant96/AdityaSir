package arrayLogicalProgram;

public class HighestElementInT5he3by3Matrix {

	public static void main(String[] args) {

		int c[][]= {{2,8,9},{4,9,0},{1,2,3}};
		int High= c[0][0];
		for(int i=0; i<c.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if(c[i][j]>High)
				{
					High=c[i][j];
				}
			}
		}
		
		System.out.println(High);
	}

}
