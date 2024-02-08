package generalProgram;

public class CountOfInteger {

	public static void main(String[] args) {

		int a=1234;
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
		System.out.println("-----#-------");
		
		for(int i=1; a>0; i++)
		{
			a=a/10;
			count++;
		}
		System.out.println(count);
	}
	

}
