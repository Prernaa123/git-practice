package threads;

public class Sequence3 extends Thread implements Runnable{
	public void run()
	{
		System.out.println("printing numbers from 201 to 225");
		for(int k=201;k<=225;k++) {
			System.out.println("k="+k);
			try {
				Thread.sleep(1000);//pause the execution for 1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
