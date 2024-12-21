/*

The append method adds a new node to the end of the linked list with the given value.

Here's how it works:

    A new node is created with the given value using the Node constructor: 
    Node newNode = new Node(value);

    If the length of the linked list is 0 (i.e., the list is empty, 
    which could happen if the original node was ever removed), both 
    the head and the tail will be pointed at the new node:

      if (length == 0) {
          head = newNode;
          tail = newNode;
      }
      
    If the list is not empty, the new node is added to the end of the
    list by making the current tail node point to the new node, and 
    updating the tail to point at the new node:

      else {
          tail.next = newNode;
          tail = newNode;
      }
      
    The length of the list is incremented by 1 to reflect the addition of the new node: 
    length++;

    By doing this, the new node is added to the end of the linked list and becomes 
    the new tail node.

*/


public void append(int value) {
    // Create a new node with the given value
    Node newNode = new Node(value);
    // If the list is empty, have both head and tail
    // point at the new node.
    // The LL could be come empty if the original node was removed.
    if (length == 0) {
        head = newNode;
        tail = newNode;
    } else {
        // If the list is not empty, set the next node of the 
        // current tail to the new node
        // and update the tail to be the new node
        tail.next = newNode;
        tail = newNode;
    }
    // Increment the length of the list
    length++;
}
