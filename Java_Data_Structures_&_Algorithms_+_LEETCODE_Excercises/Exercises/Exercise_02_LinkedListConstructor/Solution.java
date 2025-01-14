/*

This code is a constructor for a LinkedList class. The constructor is used to create 
a new instance of a LinkedList object with a single node. Here's a breakdown of its components:



    public LinkedList(int value) {: This line defines the constructor for the LinkedList class.
    It takes a single integer parameter named value, which represents the data that will be 
    stored in the first node of the list.

    Node newNode = new Node(value);: Inside the constructor, a new Node object is created 
    using the value passed into the constructor. This Node is intended to be the first node 
    of the linked list. The Node class is a nested class within the LinkedList class, designed 
    to represent the elements of the list. Each Node object has an int value that holds the 
    data and a Node reference to the next node in the list.

    head = newNode;: The head variable of the LinkedList object is set to reference the newly 
    created node. In a linked list, the head refers to the first node in the list. Since this 
    is the initial setup of the list, the new node is the first and only node, making it the head of the list.

    tail = newNode;: Similarly, the tail variable of the LinkedList is set to reference the new node. 
    The tail in a linked list refers to the last node in the list. At this point, because there's 
    only one node, it is both the head and the tail of the list.

    length = 1;: This sets the length property of the LinkedList object to 1, indicating that there 
    is currently one node in the list. The length property is used to keep track of how many nodes 
    are in the list, allowing for easy retrieval of the size of the list without needing to traverse it.



Overall, this constructor initializes a new LinkedList with a single node, setting up the 
foundational elements (head, tail) and the length of the list.

*/


public LinkedList(int value) {
    // Create a new node with the specified
    // value. This node will serve as the first
    // node in our linked list.
    // The 'value' parameter holds the data
    // that the user wants to store in the node.
    // The 'newNode' variable is of type 'Node',
    // which is a nested class inside our
    // LinkedList class, representing the
    // elements of our linked list.
    Node newNode = new Node(value); 
 
    // Set the 'head' of the linked list to point
    // to the newly created node.
    // The 'head' variable is a reference to the
    // first node in the list. Since this is the
    // first and only node at the moment of
    // creation, 'head' points to 'newNode'.
    head = newNode; 
 
    // Set the 'tail' of the linked list to point
    // to the newly created node as well.
    // The 'tail' variable is a reference to the
    // last node in the list. For a new list with
    // a single node, this new node is both the
    // head and the tail, hence 'tail' also points
    // to 'newNode'.
    tail = newNode; 
 
    // Initialize the 'length' of the linked list
    // to 1.
    // The 'length' variable keeps track of the
    // total number of nodes in the list. Since
    // we've just added our first node, the length
    // is set to 1. This helps in quickly knowing
    // the size of our linked list without needing
    // to iterate through it.
    length = 1; 
}
