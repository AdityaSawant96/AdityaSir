package generalProgram;

public class PrintTable1To10InJava {

	public static void main(String[] args) {

		int num=10;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println(" ");
		}
	}

}
