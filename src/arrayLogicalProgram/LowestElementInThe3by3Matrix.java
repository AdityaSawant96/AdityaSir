package arrayLogicalProgram;

public class LowestElementInThe3by3Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[][]= {{4,9,0},{1,4,5},{2,4,7}};
int low=b[0][0];

for(int i=0; i<b.length; i++)
{
	for(int j=0; j<b.length; j++)
	{
		if(b[i][j]<low)
		{
			low=b[i][j];
		}
	}
	
}
System.out.println(low);
	}

}
