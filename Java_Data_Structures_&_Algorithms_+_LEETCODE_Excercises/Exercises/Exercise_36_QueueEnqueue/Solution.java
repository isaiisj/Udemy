/*

This code implements the enqueue operation for a queue data structure. 
The method takes an integer value as input, creates a new Node object
with that value, and adds it to the end of the queue.

First, the method creates a new Node object with the given value. 
Then it checks whether the queue is empty by checking if the length
variable is equal to 0.  If it is, it means that the queue is currently
empty, so the new Node becomes both the first and last element of the queue.

If the queue is not empty, the method sets the next pointer of the current
last node to the new Node, so that the new Node becomes the new last node.
Finally, the length variable is incremented to reflect the addition of the
new element to the queue.

*/


public void enqueue(int value) {
    // Create a new node with the given value
    Node newNode = new Node(value);
    
    // If the queue is empty, set the new node to be both the first and last element
    if (length == 0) {
        first = newNode;
        last = newNode;
    } 
    
    // Otherwise, add the new node to the end of the queue
    else {
        // Set the next pointer of the current last node to the new node
        last.next = newNode;
        
        // Update the last pointer to point to the new node
        last = newNode;
    }
    
    // Increment the length of the queue to reflect the addition of the new element
    length++;
}
