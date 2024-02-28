package threads;

public class Sequence2 extends Thread
{
	public void run()
	{
		System.out.println("printing numbers from 101 to 125");
		for(int j=101;j<=125;j++) {
			System.out.println("j="+j);
			try {
				Thread.sleep(1000);//pause the execution for 1000ms
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
