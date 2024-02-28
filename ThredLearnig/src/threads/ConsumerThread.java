package threads;

public class ConsumerThread extends Thread {

	private Data d1;
	public ConsumerThread(Data d1) {
		this.d1=d1;
	}
	public void run()
	{
		d1.consumeX(8);
	}
}
