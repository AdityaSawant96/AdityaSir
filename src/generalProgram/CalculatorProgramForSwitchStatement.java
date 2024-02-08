package generalProgram;

public class CalculatorProgramForSwitchStatement {

	public static void main(String[] args) {

		int a= 10, b=10;
		
		int Num =2;
		
		switch(Num)
		{
		case 1:System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		
		case 4: System.out.println(a/b);
		break;
		
		default : System.out.println("None of the above case is matched");
		}
		
		
	}

}
