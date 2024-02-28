package threads;

public class SharedResource {
	synchronized void resource1()
	{
		Thread curth=Thread.currentThread();
		String thName = curth.getName();
		System.out.println(thName+"printing numbers from 1 to 25");
		for(int i=1;i<=25;i++) {
			System.out.println(thName+":i="+i);
			try {
				Thread.sleep(1000);//pause the execution for 1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	synchronized void resource2()
	{
		Thread curth = Thread.currentThread();
		String thName = curth.getName();
		System.out.println(thName+"-printing numbers from 101 to 125");
		for(int j=101;j<=125;j++) {
			System.out.println(thName+":j="+j);
			try {
				Thread.sleep(1000);//pause the execution for 1000ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
