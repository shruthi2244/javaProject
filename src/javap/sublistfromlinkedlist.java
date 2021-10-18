package javap;

import java.util.LinkedList;
import java.util.List;

public class sublistfromlinkedlist {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
	      l.add("John");
	      l.add("Sara");
	      l.add("Susan");
	      l.add("Betty");
	      l.add("Nathan");
	      System.out.println("The LinkedList is: " + l);
	      List subl = l.subList(1, 3);
	      System.out.println("The SubList is: " + subl);
	   
	}

}
