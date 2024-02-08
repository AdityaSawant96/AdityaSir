package arrayLogicalProgram;

public class PrintStringElementInDesendingOrder {

	public static void main(String[] args) {

		
		String a[]= {"football","volleyball","cricket","ruby"};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
			if(a[j].compareTo(a[i])>0)
			{
				String temp=a[j]; 
				a[j]=a[i];
				a[i]=temp;
			}
			
		}
			System.out.println(a[i]);
	}
	

	}
}
