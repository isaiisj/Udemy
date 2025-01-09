/*

The append method adds a new node to the end of the list with the given integer value.

The method creates a new Node object with the given value, and then checks if the 
length of the list is 0. If the length is 0, the new node is both the head and the 
tail of the list, so the method sets the head and tail member variables to the new node.

If the length is not 0, the new node is added to the end of the list by setting 
the next field of the current tail node to the new node, and setting the prev field
of the new node to the current tail node. Then, the method sets the tail member 
variable to the new node.

Finally, the method increments the length member variable by 1 to indicate that 
the list has one more node.

*/


public void append (int value) {
    // Create a new node with the given value.
    Node newNode = new Node(value);
    if(length == 0) {
        // If the list is empty, set both the head and tail to the new node.
        head = newNode;
        tail = newNode;
    } else {
        // Otherwise, add the new node to the end of the list by updating the `next` and `prev` fields of the relevant nodes.
        // Set the `next` field of the current tail node to the new node.
        tail.next = newNode;
        // Set the `prev` field of the new node to the current tail node.
        newNode.prev = tail;
        // Set the `tail` member variable to the new node.
        tail = newNode;
    }
    // Increment the `length` member variable by 1 to indicate that the list has one more node.
    length++;
}
