
public class JavaThreads {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			  public void run() {
				  System.out.println("JavaThreads");
			  }
		};
		r.run();
		
		Runnable r1 = new Runnable() {
			  public void run() {
			    try {
			      while (true) {
			        System.out.println("Hello, world!");
			        Thread.sleep(1000L);
			      }
			    } catch (InterruptedException iex) {}
			  }
		};
		Runnable r2 = new Runnable() {
		  public void run() {
		    try {
		      while (true) {
		        System.out.println("Goodbye, " +
				"cruel world!");
		        Thread.sleep(2000L);
		      }
		    } catch (InterruptedException iex) {}
		  }
		};
		
		/*
		r2.run();
		System.out.println("post r2");
		r1.run();
		System.out.println("post r1");
		//*/
		
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(r2);
		thr1.start();
		thr2.start();

	}

}
