package oops.Inheritance;

public class Single {
	public static void main(String[] main) {
		Double d=new Double();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.n+d.m);
		
	}

}

class Double extends Triple {
	int b=20;
	String m="World";
	
}

class Triple {
	int a=10;
	String n="Hello";
	

	
}

