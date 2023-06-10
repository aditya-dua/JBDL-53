package sync;

public class Thread2 extends Thread{

	Table t;
	
	public Thread2(Table t) {
		// TODO Auto-generated constructor stub
	
		this.t=t;
	
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		t.printTable(10);
	}
}
