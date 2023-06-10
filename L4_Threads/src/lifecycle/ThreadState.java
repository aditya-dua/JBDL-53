package lifecycle;

public class ThreadState implements Runnable{

	public static Thread t1;
	public static ThreadState obj;
	
	public static void main(String[] args) {
		
		obj = new ThreadState();
		t1=new Thread(obj);
		
		System.out.println("T1 State:"+t1.getState());

		t1.start();
		System.out.println("State of t1:"+t1.getState());
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Runnable1 r1= new Runnable1();
		Thread t2=new Thread(r1);
		System.out.println("State of t2:"+t2.getState());
		t2.start();
		System.out.println("State of t2:"+t2.getState());

		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("State of t2:"+t2.getState());

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State of t2:"+t2.getState());

	}
	
}
