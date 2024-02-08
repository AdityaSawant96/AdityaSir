package arrayLogicalProgram;

public class WhichElementINTheArrayAreRepeatHowManyTimesInCaseOfString {

	public static void main(String[] args) {
String []word ={"Akshay","Ajay","Akshay","Aditya","Aditya"};
int count=1;
for(int i=0; i<word.length; i++)
{
	String num1=word[i];
	if(num1==null)
	{
		;
	}
	else
	{
		for(int j =i+1; j<word.length; j++)
		{
			if(num1==word[j])
			{
				count++;
				word[j]=null;
			}
		}
		System.out.println("Duplicate Element in the Array:= "+word[i]+":=count:= "+count);
		count=1;
	}
}
}

}
