package stringLogicalProgram;

import java.util.Scanner;

public class CheckEnterCharacterPresentInStringOrNot {

	public static void main(String[] args) {
//Enter String input at run Time
		int count=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String:= ");
		String s= scr.nextLine();
		
		System.out.println("Enter a Character := ");
		char ch= scr.next().charAt(0);
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
             count++;			
			}
			
		}
		if(count>0)
		{
			System.out.println("The character is Present in String");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
