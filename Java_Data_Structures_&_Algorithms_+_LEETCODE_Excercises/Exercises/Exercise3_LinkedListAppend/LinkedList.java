/*

Implement the append method that appends a new node to the end of the linked list.

Return type: void


The method should perform the following tasks:

1. Accept an integer value as an argument, which will be the value of the new node.

2. Create a new Node object called newNode with the given value.

3. If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode.

4. If the length of the linked list is greater than 0, perform the following tasks:

	- Set the next attribute of the current tail node to the newNode.

	- Update the tail pointer of the list to point to the newNode.

5. Increment the length attribute of the list by 1.

*/
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }
    

	// WRITE APPEND METHOD HERE //
	
	public void append(int value){
	    Node newNode = new Node(value);
	    
	    if(length == 0){
	        head = newNode;
	        tail = newNode;
	    }else{
	        tail.next = newNode;
	        tail = newNode;
	    }
	    length++;
	}
	
	//////////////////////////////

}
