package trad;

import java.util.ArrayList;

public class Table {
	
	ArrayList<Integer> al;
	
	public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+n+" = "+i*n );
		}
	}

}
