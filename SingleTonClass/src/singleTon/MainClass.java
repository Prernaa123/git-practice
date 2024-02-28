package singleTon;

public class MainClass {

	public static void main(String[] args) {
		
	Immutable i1 = new Immutable(100);
	System.out.println(i1);
	
	i1=new Immutable(200);
	System.out.println(i1);
	
	i1 = new Immutable(300);
	System.out.println(i1);

	}

}
