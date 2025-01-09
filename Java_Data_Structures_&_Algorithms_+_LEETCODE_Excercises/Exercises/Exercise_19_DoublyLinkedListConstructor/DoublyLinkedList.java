/*

Design a class called DoublyLinkedList that represents a doubly linked list.

The class should have the following attributes and methods:

Attributes:

	1. head: a Node object that represents the first node in the doubly linked list.

	2. tail: a Node object that represents the last node in the doubly linked list.

	3. length: an integer representing the number of nodes in the doubly linked list.



Inner class Node:

	1. value: an integer representing the value of the node.

	2. next: a Node object representing the next node in the doubly linked list.

	3. prev: a Node object representing the previous node in the doubly linked list.

	4. A constructor that accepts an integer value as an argument and initializes the value attribute.



Methods:

	1. Constructor DoublyLinkedList: a constructor that accepts an integer value as an argument, 
 	   initializes a new Node object called newNode with the given value, sets both the head and 
     	   tail attributes of the list to the newNode, and initializes the length attribute to 1.

*/


public class DoublyLinkedList {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    
    Node head;
    Node tail;
    int length;
    
    public class Node {
        int value;
        Node next;
        Node prev;
        
        Node (int value){
            this.value = value;
        }
    }
    
    DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    
	//////////////////////////////////////////////////////////////

  
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
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
}
