package arrayLogicalProgram;

import java.util.Arrays;

public class SecondSmallestElementInTheArray {
public static int SecondSmallestElement;
	public static void main(String[] args) {
         int number[]= {12,56,89,100};
       SecondSmallestElementInTheArray.method1(number);
	}
	
	
	public static void method1(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
		SecondSmallestElement=Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow();
		
	}
		System.out.println(SecondSmallestElement);

}
}