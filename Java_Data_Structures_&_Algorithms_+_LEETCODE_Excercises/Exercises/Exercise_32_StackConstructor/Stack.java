/*

Implement a Stack class with a constructor that initializes a new stack with a given value.



The class should have the following attributes and constructor:

    1. A Node class that represents the nodes of the stack:

        An int attribute called value that stores the value of the node.

        A Node attribute called next that points to the next node in the stack.

        A constructor that accepts an integer value as an argument and initializes
        the value attribute with the given value.

    2. A private Node attribute called top that points to the top node of the stack.

    3. A private int attribute called height that keeps track of the number of elements in the stack.

    4. A constructor for the Stack class that performs the following tasks:

        Accepts an integer value as an argument, which will be the value of the first node in the stack.

        Creates a new Node object called newNode with the given value.

        Initializes the top attribute with the newNode.

        Sets the height attribute to 1.

*/


public class Stack {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
	
	private Node top;
	private int height;
	
	public class Node {
	    Node next;
	    int value;
	    
	    Node(int value){
	        this.value = value;
	    }
	}
	
	Stack(int value){
	    Node newNode = new Node(value);
	    top = newNode;
	    height = 1;
	}
	
	/////////////////////////////////////////////////////////////

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }
    
    public void makeEmpty() {
        top = null;
        height = 0;
    }
    
}
