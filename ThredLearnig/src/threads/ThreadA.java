package threads;

public class ThreadA extends Thread{
	SharedResource sr;
	ThreadA(SharedResource sr)
	{
		this.sr=sr;
	}
	public void run()
	{
		sr.resource1();
	}
}
