
public class RunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenerateNumberUsingLoopRunnable gen=new GenerateNumberUsingLoopRunnable();
		
		Thread t1= new Thread(gen);
		GenerateNumberUsingLoopRunnable gen1=new GenerateNumberUsingLoopRunnable();

		t1.start();
		
		Thread t2 = new Thread(gen1);
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main:"+i);	
		}
	}

}
