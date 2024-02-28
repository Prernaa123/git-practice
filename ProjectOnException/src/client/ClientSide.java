package client;


import server.InvalidAgeException;
import server.ServerSide;
public class ClientSide {
		final static private ServerSide c1 = new ServerSide();
		
		void sendData(User usr) {
			System.out.println("Sending registration details to server");
			try {
				c1.receiveData(usr);
			}catch(InvalidAgeException exp) {
				System.out.println(exp.getMessage());
			}
		}
}
