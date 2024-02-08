package generalProgram;

public class RootsOfAQuadraticEquation {

	public static void main(String[] args) {

		int a=5,b=3,c=-2;
		double e =b*b-4*a*c;
		double d= Math.sqrt(e);
		double k=-(b+d)/2*a;
		double o=-(b-d)/2*a;
		System.out.println(k+" ,"+o);
	}

}
