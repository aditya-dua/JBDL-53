import java.util.Iterator;

public class IntThread extends Thread{

	
	
	public IntThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntThread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public IntThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Int Thread:"+i+this.getName());
			
			
			
		}
	}
}
