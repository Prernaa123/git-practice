package threads;

public class ProduceThread extends Thread {
	private Data  d1;
	
	public ProduceThread(Data d1) {
		this.d1=d1;
	}
	public void run()
	{
		d1.produceX(20);
	}
}
