package threads;

public class Sequence1 extends Thread 
{
	public void run()
	{
		System.out.println("printing numbers from 1 to 25");
		for(int i=1;i<=25;i++) {
			System.out.println("i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
