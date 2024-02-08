package arrayLogicalProgram;

import java.util.Arrays;

public class SecondSmallestElementInTheArray1 {
public static int SecondSmallest;;
	public static void main(String[] args) {
		int ad[]= {12,78,90,100};
		SecondSmallestElementInTheArray1.method1(ad);
	}
	public static void method1(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			SecondSmallest=Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow();
	}
System.out.println(SecondSmallest);
}
}