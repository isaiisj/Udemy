/*

The prepend method adds a new node containing the given
value to the head of the doubly linked list.

Here's how it works:

    1. A new node is created with the given value using 
       the Node newNode = new Node(value) statement.

    2. If the list is empty (i.e., length == 0), the new
       node becomes both the head and tail of the list using
       the statements head = newNode; and tail = newNode;.

    3. If the list is not empty, the newNode is inserted at
       the head of the list, before the existing head node,
       using the following steps:

        - Set the next field of the newNode to point to the
          current head node: newNode.next = head;

        - Set the prev field of the current head node to point
          to the newNode: head.prev = newNode;

        - Set the head of the list to be the newNode: head = newNode;

    4. Finally, the length of the list is incremented by 1: length++;.

*/


public void prepend(int value) {
    // Create a new node with the given value.
    Node newNode = new Node(value);
 
    // If the list is empty, set both head and tail to the new node.
    if(length == 0) {
        head = newNode;
        tail = newNode;
    } 
    // If the list is not empty, insert the new node at the head of the list.
    else {
        // Set the next field of the new node to point to the current head.
        newNode.next = head;
        // Set the prev field of the current head to point to the new node.
        head.prev = newNode;
        // Set the head of the list to be the new node.
        head = newNode;
    }
    // Increment the length of the list.
    length++;
}
