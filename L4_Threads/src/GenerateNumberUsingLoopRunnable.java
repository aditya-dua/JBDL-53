
public class GenerateNumberUsingLoopRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			System.out.println("Runnable::"+i);
			
		}
	}

}
