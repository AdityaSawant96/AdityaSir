package stringLogicalProgram;

public class WordsStartWithTheVowels {

	public static void main(String[] args) {
String abc ="My name Is Aditya Sawant";
String ak = abc.toLowerCase();
String word[]=ak.split(" ");
String value ="";
for(int i=0; i<word.length; i++)
{
	value=word[i];
	char ch = value.charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println("Words Start with The Vowels:= "+value);
	}
	else
	{
		;
	}
	
}
	}
}


