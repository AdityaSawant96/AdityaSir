package stringLogicalProgram;

public class SwapFirstAndLastCharacterOfEachWordInJava {

	public static void main(String[] args) {
String abc ="Ajinkya Shethe";
char ch[]=abc.toCharArray();
for(int i=0; i<ch.length; i++)
{
	int k=i;
	while(i<ch.length && ch[i]!=' ')
	{
		i++;
	}
	char temp=ch[k];
	ch[k]=ch[i-1];
	ch[i-1]=temp;
}
System.out.println(ch);
	}

}
