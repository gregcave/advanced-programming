class A implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
 
	public static void main(String[] argv) throws Exception {
		Thread t = new Thread(new A());
		t.start();
	}
}