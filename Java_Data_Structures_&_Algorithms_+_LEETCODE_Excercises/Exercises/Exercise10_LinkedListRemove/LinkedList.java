/*

Implement a method called remove that removes a node at a specified index 
in the linked list.

Return type: Node (the node that has been removed)



The method should perform the following tasks:

    1. Accept an integer index as an argument, representing the index of the 
       node to be removed.

    2. If the index is less than 0 or greater than or equal to the length of
       the list, return null.

    3. If the index is 0, call the removeFirst method and return its result.

    4. If the index is equal to the length of the list minus 1, call the removeLast
       method and return its result.

    5. Call the get method with the index minus 1 to obtain the node before the 
       specified index.

    6. Create a temporary Node object called temp and set it to the next attribute
       of the node before the specified index.

    7. Update the next attribute of the node before the specified index to point to 
       the next attribute of the temporary Node object.

    8. Set the next attribute of the temporary Node object to null.

    9. Decrement the length attribute of the list by 1.

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

    public boolean insert(int index, int value)  {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
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

	// WRITE REMOVE METHOD HERE //
	
	public Node remove(int index){
	    
	    if (index < 0 || index >= length) return null;
	    
	    if (index == 0) return removeFirst();
	
	    if (index == length - 1) return removeLast();

	    Node prev = get(index - 1);
	    Node temp = prev.next;
	    prev.next = temp.next;
	    temp.next = null;
	    length--;
	    
	    return temp;
	}
	
	//////////////////////////////

}
