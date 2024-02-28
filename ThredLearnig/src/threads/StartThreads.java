package threads;

public class StartThreads {

	public static void main(String[] args) {
		System.out.println("main method started");
		Data datObj = new Data();
		ConsumerThread t1 = new ConsumerThread(datObj);
		ConsumerThread t2 = new ConsumerThread(datObj);
		ConsumerThread t3 = new ConsumerThread(datObj);
		ProduceThread t4=new ProduceThread(datObj);
		
		t1.setName("T1-Thread");
		t2.setName("T2-Thread");
		t3.setName("T2-Thread");
		t4.setName("T2-Thread");
		
		t1.start();
		t2.start();
		t3.start();
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
