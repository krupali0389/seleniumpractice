package Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortElement {

	public static void main(String[] args) {
		// WAP to validate list in sorted order
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(4);
	System.out.println(list);
	Collections.sort(list);//Ascending order
	System.out.println("Ascending order: "+list);
	Collections.sort(list,Collections.reverseOrder());//descending order
	System.out.println("Descending order: "+list);
	
				
		
		

	}

}
