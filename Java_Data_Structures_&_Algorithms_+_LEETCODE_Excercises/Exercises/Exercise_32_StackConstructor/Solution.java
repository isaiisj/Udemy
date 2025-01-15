/*

The Stack class has two instance variables: 
top and height. top is a reference to the top node of the stack, 
and height is an integer that represents the number of nodes in the stack.

Inside the Stack class, there is also an inner class called Node.  
This class represents a single node in the stack and has two instance variables: 
value, which represents the value stored in the node, and next, which is a
reference to the next node in the stack.

The constructor for the Stack class takes an integer value as its argument. 
It creates a new Node object with the given value, sets the top reference 
to point to this new node, and initializes the height variable to 1.  
This creates a new stack with a single node containing the given value.

*/


 // Initialize the top node of the stack and its height
    private Node top;
    private int height;
 
    // Create a Node class to represent individual nodes in the stack
    class Node {
        int value; // stores the value of the node
        Node next; // stores the reference to the next node in the stack
 
        // Constructor to create a new node with the given value
        Node(int value) {
            this.value = value;
        }
    }
    
    // Constructor to create a new stack with the given value as the top element
    public Stack(int value) {
        Node newNode = new Node(value); // create a new node with the given value
        top = newNode; // set the new node as the top of the stack
        height = 1; // set the initial height of the stack to 1
    }
