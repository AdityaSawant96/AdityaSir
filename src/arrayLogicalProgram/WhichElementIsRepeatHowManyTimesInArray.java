package arrayLogicalProgram;

public class WhichElementIsRepeatHowManyTimesInArray {

	public static void main(String[] args) {

		int a[]= {12,41,14,12,778,41};
		int count=1;
		for(int i=0; i<a.length; i++)
		{
			int num1=a[i];
			if(num1==0)
			{
				;
			}
			else
			{
			for( int j=i+1; j<a.length; j++)	
			{
				if(num1==a[j])
				{
					count++;
					a[j]=0;
				}
			}
			System.out.println("element is repeat in the array:= "+a[i]+ "= count:="+count);
			count=1;
			}
		}
	}

}
