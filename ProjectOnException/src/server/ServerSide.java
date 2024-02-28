package server;
import client.User;
public class ServerSide {
	
	final static private VerifyUserAge vua = new VerifyUserAge();
	
	public void receiveData(User usr) throws InvalidAgeException
	{
		System.out.println("Receiving data from client");
		if(vua.validateAge(usr)!= true) {
			System.out.println("Registration failed");
		throw new InvalidAgeException("Age should be greater than 18");
		}
		else {
			System.out.println("Registration Success");
		}
	}
}
