package arrayLogicalProgram;

public class PrintsWordStartWithSAndEndWithG {

	public static void main(String[] args) {

 String a[]= {"Sameer","Dog","Cooking","Sing", "brand","KTM"};
 for(int i=0; i<a.length; i++)
 {
	 if(a[i].charAt(0)=='S'||a[i].charAt(a[i].length()-1)=='g')
	 {
		 System.out.println(a[i]);
	 }
 }
	}

}
