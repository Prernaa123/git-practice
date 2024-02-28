package threads;

public class Data
{
	private int x = 4;
	
	public int getX() {
		return x;
	}
	synchronized public void consumeX(int arg)
	{
		String th_name = Thread.currentThread().getName();
		System.out.println(th_name+" running");
		if(x<5) {
			System.out.println("insufficient data , waiting for notification");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(th_name+"resuming back");
			x=x-arg;
			System.out.println(x);
		}else {
			System.out.println("data sufficient");
			x=x-arg;
		}
	}
	synchronized public void produceX(int arg)
	{
		String th_name=Thread.currentThread().getName();
		System.out.println(th_name+"producing x values");
		x=x+arg;
		System.out.println(th_name+"notifying the threads...");
		notifyAll();
	}
}
