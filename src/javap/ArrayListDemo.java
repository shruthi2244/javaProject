package javap;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[])
    {
  
        // Creating an empty ArrayList
        ArrayList<Integer> a1  = new ArrayList<Integer>();
  
        // Use add() method
        // to add elements in the list
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
  
        // Displaying the list
        System.out.println("First ArrayList: "
                           + a1);
  
        // Creating another linked list and copying
        ArrayList a2 = new ArrayList();
       a2 = (ArrayList)a1.clone();
  
        // Displaying the other linked list
        System.out.println("Second ArrayList is: "
                           + a2);
    }
}
