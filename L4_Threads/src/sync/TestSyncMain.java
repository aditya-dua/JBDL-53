package sync;

public class TestSyncMain {

	
	/**
	 * Bank Account: 
	 * 
	 * Net Banking
	 * Debit Card
	 * UPI
	 * 
	 * get me balance, withdraw: 10000
	 * 
	 * 
	 * sync(test){
	 * WebDriver driver = new ChromeDriver();
	 * WebDriver driver2 = new GeckoDriver();
	 * }
	 * 
	 * sync(chromeTest){
	 * }
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Table table = new Table();
		
		
		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);
		
		thread1.start();
		thread2.start();
	}

}
