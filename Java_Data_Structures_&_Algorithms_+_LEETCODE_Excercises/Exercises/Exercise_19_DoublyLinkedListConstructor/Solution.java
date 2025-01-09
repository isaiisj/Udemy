/*

The DoublyLinkedList class has three private member variables:

    head: a reference to the first node in the list.

    tail: a reference to the last node in the list.

    length: an integer that represents the number of nodes in the list.

The DoublyLinkedList class also has a nested class Node that represents
a node in the doubly linked list. Each Node object has three member variables:

    value: an integer value that represents the data stored in the node.

    next: a reference to the next node in the list.

    prev: a reference to the previous node in the list.

The Node class has a constructor that takes an integer value and sets the 
value member variable to that value.

The DoublyLinkedList class has a constructor that takes an integer value and
creates a new doubly linked list with a single node. The constructor creates
a new Node object with the given value, sets the head and tail member variables
to the new node, and sets the length member variable to 1.

*/


// Declare head of the doubly linked list.
    private Node head;
    // Declare tail of the doubly linked list.
    private Node tail;
    // Declare length of the doubly linked list.
    private int length;
 
    // Nested class for the nodes of the doubly linked list.
    class Node {
        // Declare integer value of the node.
        int value;
        // Declare reference to the next node.
        Node next;
        // Declare reference to the previous node.
        Node prev;
 
        // Constructor to create a new node with a given value.
        Node(int value) {
            this.value = value;
        }
    }
 
    // Constructor to create a new doubly linked list with a single node.
    public DoublyLinkedList(int value) {
        // Create a new node with the given value.
        Node newNode = new Node(value);
        // Set the head and tail of the list to the new node.
        head = newNode;
        tail = newNode;
        // Set the length of the list to 1.
        length = 1;
    }
