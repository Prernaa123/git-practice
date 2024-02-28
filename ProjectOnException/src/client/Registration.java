package client;

public class Registration {
	
		final private static ClientSide sc = new ClientSide();
		
		public void submit(String name, long phonenum, String email, int age, String password) {
			System.out.println("Registering and submitting user data to server");
			User u1 = new User(name,phonenum,email,age,password);
			sc.sendData(u1);
		}
}
