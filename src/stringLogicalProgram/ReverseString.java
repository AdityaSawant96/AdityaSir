package stringLogicalProgram;

public class ReverseString {

	public static void main(String[] args) {
String s="Aditya Sawant";
String str =s+" ";
String rev="";
String word="";
for(int i=0; i<str.length(); i++)
{
	char ch[]=str.toCharArray();
	if(ch[i]!=' ')
	{
		word=word+ch[i];
	}
	else
	{
		rev=word+" "+rev;
		word="";
	}
}
System.out.println(rev);
	}

}
