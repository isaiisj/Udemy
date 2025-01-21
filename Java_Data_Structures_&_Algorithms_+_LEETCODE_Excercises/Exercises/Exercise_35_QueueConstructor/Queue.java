/*

Create a Queue class that represents a queue data structure using nodes.



Implement the constructor and instance variables as follows:

    1. Create a private instance variable first that will store a reference
       to the first node in the queue.

    2. Create a private instance variable last that will store a reference
       to the last node in the queue.

    3. Create a private instance variable length that will store the current
       length of the queue.

    4. Create a nested Node class with an integer value and a reference to 
       the next Node in the queue.

    5. Implement a constructor for the Queue class that takes an integer value
       as an argument, creates a new Node with the given value, and initializes
       the first, last, and length instance variables.

*/


public class Queue {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	
	private Node first;
	private Node last;
	private int length;
	
	public class Node {
	    
	    Node next;
	    int value;
	    
	    Node(int value){
	        
	        this.value = value;
	        
	    }
	    
	}
	
	Queue(int value){
	    
	        Node newNode = new Node(value);
	        first = newNode;
	        last = newNode;
	        length++;
	        
	}
	
	//////////////////////////////////////////////////////////////
   

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }

}
