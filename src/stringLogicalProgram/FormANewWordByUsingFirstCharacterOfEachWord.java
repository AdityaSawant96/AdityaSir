package stringLogicalProgram;

public class FormANewWordByUsingFirstCharacterOfEachWord {

	public static void main(String[] args) {

		String abc ="Indian Police Service";
		String ak[]=abc.split(" ");
		String value="";
		String CombineWord ="";
		for(int i=0; i<ak.length;i++)
		{
			value=ak[i];
			char ch = value.charAt(0);
			CombineWord=CombineWord+ch;
		}
		System.out.println(CombineWord);
	}

}
