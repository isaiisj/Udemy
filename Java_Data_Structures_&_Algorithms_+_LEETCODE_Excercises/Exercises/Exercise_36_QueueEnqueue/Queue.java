/*

The method should perform the following tasks:

    1. Accept an integer value as an argument, which will be the
       value of the new node.

    2. Create a new Node object called newNode with the given value.

    3. If the length of the queue is 0, set both the first and last
       pointers of the queue to newNode.

    4. If the length of the queue is greater than 0, perform the following tasks:
        a. Set the next attribute of the current last node to newNode. 
        b. Update the last pointer of the queue to point to newNode.

    5. Increment the length attribute of the queue by 1.

*/


public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

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

	// WRITE ENQUEUE METHOD HERE //
	
	public void enqueue(int value){
	    
	    Node newNode = new Node(value);
	    
	    if (length == 0){
	        first = newNode;
	        last = newNode;
	    }
	    
	    if (length > 0){
	        last.next = newNode;
	        last = newNode;
	    }
	    
	    length++;
	}
	
	///////////////////////////////

}

