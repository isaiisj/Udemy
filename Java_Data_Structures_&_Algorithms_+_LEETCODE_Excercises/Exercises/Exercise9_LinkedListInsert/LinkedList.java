/*

Implement a method called insert that inserts a new node at a 
specified index in the linked list.

Return type: boolean

Method signature: public boolean insert(int index, int value)



The method should perform the following tasks:

    1. Accept an integer index as an argument, representing the index 
       at which the new node should be inserted.

    2. Accept an integer value as an argument, representing the value 
       of the new node.

    3. If the index is less than 0 or greater than the length of the list, 
       return false.

    4. If the index is 0, call the prepend method with the provided value 
       and return true.

    5. If the index is equal to the length of the list, call the append 
       method with the provided value and return true.

    6. Create a new Node object called newNode with the provided value.

    7. Call the get method with the index minus 1 to obtain the node before 
       the specified index.

    8. Update the next attribute of the newNode to point to the next attribute 
       of the node before the specified index.

    9. Update the next attribute of the node before the specified index to point 
       to the newNode.

    10. Increment the length attribute of the list by 1.

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

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

	// WRITE INSERT METHOD HERE //
	
	public boolean insert(int index, int value){
	    
	    if(index < 0 || index > length) return false;
	    
	    if (index == 0){
	        prepend(value);
	        return true;
	    }
	    if (index == length){
	        append(value);
	        return true;
	    }
	    
	    Node newNode = new Node(value);
	    Node temp = get(index - 1);
	    newNode.next = temp.next;
	    temp.next = newNode;
	    length++;
	    
	    return true;
	    
	}
	
	//////////////////////////////

}
