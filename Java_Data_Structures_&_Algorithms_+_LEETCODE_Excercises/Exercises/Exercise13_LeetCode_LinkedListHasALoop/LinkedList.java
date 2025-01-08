/*

Write a method called hasLoop that is part of the linked list class.

The method should be able to detect if there is a cycle or loop present
in the linked list.

You are required to use Floyd's cycle-finding algorithm (also known as the
"tortoise and the hare" algorithm) to detect the loop.

This algorithm uses two pointers: a slow pointer and a fast pointer.
The slow pointer moves one step at a time, while the fast pointer moves
two steps at a time. If there is a loop in the linked list, the two pointers
will eventually meet at some point. If there is no loop, the fast pointer
will reach the end of the list.

The method should follow these guidelines:



    1. Create two pointers, slow and fast, both initially pointing to the head of 
       the linked list.

    2. Traverse the list with the slow pointer moving one step at a time, while
       the fast pointer moves two steps at a time.

    3. If there is a loop in the list, the fast pointer will eventually meet the 
       slow pointer. If this occurs, the method should return true.

    4. If the fast pointer reaches the end of the list or encounters a null value,
       it means there is no loop in the list. In this case, the method should return false.



Output:

    Return true if the linked list has a loop.

    Return false if the linked list does not have a loop.



Constraints:

    You are not allowed to use any additional data structures (such as arrays) or modify 
    the existing data structure.

    You can only traverse the linked list once.


Method signature:

    public boolean hasLoop()


If your Linked List contains a loop, it indicates a flaw in its implementation.
This situation can manifest in several ways:

11 -> 3
|     |
7 <- 23


11 -> 3     4-> null
|     |
7 <- 23


 4 -> 11 -> 3    
      |     |
      7 <- 23

Note:

In this problem, you should use the slow and fast pointer technique
(also known as Floyd's Tortoise and Hare algorithm) to efficiently
detect the presence of a loop in the linked list.

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

	// WRITE HASLOOP METHOD HERE //
	
	public boolean hasLoop(){
	    // two pointers fast and slow
	    Node slow = head;
	    Node fast = head;
	    
	    while(fast != null && fast.next != null){

            // move pointers first 1 step and 2 steps respectively
            slow = slow.next;
            fast = fast.next.next;
            
            // if two pointers are the same exists a cycle
	        if(slow == fast){
	            return true;
	        }
	    }
	    
	    return false;
	    
	}
	
	///////////////////////////////

}
