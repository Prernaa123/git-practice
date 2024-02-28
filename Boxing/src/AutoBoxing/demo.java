package AutoBoxing;

public class demo {
	
	static demo d;
	
	private demo()
	{
		
	}
	
	static demo getInstance()
	{
		
		if(d==null)
			d=new demo();
		
		return d;
	}
	public static void main(String[] args) {
		
		demo d1=getInstance();
		System.out.println(d1);
		demo d2=getInstance();
		System.out.println(d2);
		demo d3=getInstance();
		System.out.println(d3);
		
		
	}

}
