package javap;

import java.util.Iterator;
import java.util.LinkedList;

public class iteratethroughLinkedList {
	public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // adding elements to linked list
        linkedList.add("Geeks");
        linkedList.add("For");
        linkedList.add("Geek");
        linkedList.add("2020");
        linkedList.add("2021");
  
        // getting an iterator which points at the
        // end of the linkedlist
        Iterator<String> iterator = linkedList.descendingIterator();
  
        // traversing the linkedlist
        // hasNext() will tell if previous element is
        // available or not
        // next() with descending iterator will return the
        // previous element
        // and after getting the previous element
        // is moves the cursor to next previous element.
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}
