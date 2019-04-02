package hashmap;

import java.util.Random;

public class Thraed implements Runnable {

	
	private int nextInLine = 1;
	
	private synchronized void doctorTest() throws InterruptedException {
		
		while (Integer.parseInt(Thread.currentThread().getName()) != nextInLine)
		{
			this.wait();
		}
		System.out.println("patient number " + 
		Thread.currentThread().getName() +
		" is being checked by the doctor");
		nextInLine++;
		notifyAll();
		
		
		
	}

	
	private void bloodCheck() throws InterruptedException
	{
		System.out.println("patient number " + 
				Thread.currentThread().getName() +
				" is getting blood test");
		Random r = new Random();
		Thread.sleep(r.nextInt(10000));
		doctorTest();
	}
	
	@Override
	public void run() {
		
		try {
			bloodCheck();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
