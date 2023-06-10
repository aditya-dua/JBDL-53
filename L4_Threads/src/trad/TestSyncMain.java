package trad;

public class TestSyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table = new Table();
		
		Thread1 thread1 = new Thread1(table);
		Thread2 thread2 = new Thread2(table);
		
		thread1.start();
		thread2.start();
	}

}
