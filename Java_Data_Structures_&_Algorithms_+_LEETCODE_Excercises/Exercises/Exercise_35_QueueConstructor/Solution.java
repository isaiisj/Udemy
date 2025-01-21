/*

Here's a brief explanation of what each part of the code does:

    1. private Node first; and private Node last; are instance
       variables of the Queue class that point to the first and
       last nodes of the queue, respectively.

    2. private int length; is an instance variable that keeps
       track of the number of nodes in the queue.

    3. class Node { ... } is an inner class that represents a 
       node in the queue. It has two instance variables: value,
       which stores the value of the node, and next, which points
       to the next node in the queue.

    4. public Queue(int value) { ... } is the constructor of the
       Queue class that initializes the queue with a single node 
       containing the given value. It creates a new Node object 
       with the given value, and sets both first and last to point
       to this new node. It also initializes the length to 1.

Overall, this code sets up the basic structure of a queue and initializes
it with a single node (which can be removed later).   This node will be
assigned the given value.  Other methods can be added to this class to
perform operations on the queue, such as enqueueing and dequeuing nodes.

*/


 // Declare instance variables for the Queue class
    private Node first;
    // Pointer to the first node in the queue
    private Node last;
    // Pointer to the last node in the queue
    private int length;
    // Number of nodes in the queue
 
    // Define a nested class called Node to represent a single node in the queue
    class Node {
        int value;
        // Value stored in the node
        Node next;
        // Pointer to the next node in the queue
 
        Node(int value) {
            this.value = value;
        }
    }
 
    // Define a constructor for the Queue class, 
    // which initializes the queue with a single value
    public Queue(int value) {
        Node newNode = new Node(value);
        // Create a new node with the specified value
        first = newNode;
        // Set both the head and tail to the new node since 
        // it is the only node in the queue
        last = newNode;
        // The length of the queue is 1, since there is only one node
        length = 1;
    }
