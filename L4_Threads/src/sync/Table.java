package sync;

public class Table {
	
	public void printTable(int n) {
		/*
		 * 10 lines of code
		 * are not thread 
		 */
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+" X "+n+" = "+i*n );
			}
		}
		
		/*
		 * 10 lines of code
		 * are not thread 
		 */
	}
	
	public void display() {
		System.out.println("Table Display");
	}

}
