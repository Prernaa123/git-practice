package mock1;

class Encapsulation
{
	private String insta_password;
	public String getpsw()
	{
		return insta_password;
	}
	public void setpsw(String newpsw)
	{
		insta_password = newpsw;
		//insta_password = "Bh00mo7@123";
	}
}
public class Service 
{
	public static void main(String[] args) 
	{
		Encapsulation  e1 = new Encapsulation();
		//System.out.println(e1.getpsw());
		e1.setpsw("Bh00mo7@123");
		//System.out.println(e1.getpsw());
		e1.setpsw("hi");
		System.out.println(e1.getpsw());
	}
}
