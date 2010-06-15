
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
	}

}
