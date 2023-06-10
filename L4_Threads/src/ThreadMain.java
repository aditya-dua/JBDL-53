
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntThread i1 = new IntThread("My First Thread with P : 10");
		
		//i1.start();
		i1.run();
		
		IntThread i2 = new IntThread("My Second Thread");
		i2.setDaemon(true);
		i2.start();
		
		System.out.println("Thread Name:"+i2.getName());
		System.out.println("Thread ID:"+i2.getId());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Int Thread:"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		i2.start();
	}

}
