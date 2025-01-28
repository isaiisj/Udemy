/*

The removeLast method removes and returns the last node of the list.

The method first checks if the list is empty by testing if length is 0.
If the list is empty, the method returns null immediately.

If the list is not empty, the method creates a new Node variable temp
to hold a reference to the last node of the list.  Then, the method 
checks if the length of the list is 1.  If the length is 1, the list
becomes empty after removing the last node, so the method sets both 
head and tail to null.  Otherwise, the method removes the last node 
from the list by updating the tail and prev fields of the second-to-last
node and the next and prev fields of the last node.  Specifically, the
method sets tail to the previous node of the current tail, sets the next
field of the new tail to null, and sets the prev field of temp to null.

Finally, the method decrements length by 1 and returns the temp node,
which points to the removed last node.

*/


public Node removeLast() {
    // If the list is empty, return null.
    if(length == 0) return null;
    // Create a new node `temp` to hold the value of the last node.
    Node temp = tail;
    // If the list contains only one node, set both `head` and `tail` to null.
    if (length == 1) {
        head = null;
        tail = null;
    } else {
        // Otherwise, update the `tail` and `prev` fields of the second-to-last node
        // and the `next` and `prev` fields of the last node.
        // Set the `tail` to the previous node of the current tail.
        tail = tail.prev;
        // Set the `next` field of the new tail to `null`.
        tail.next = null;
        // Set the `prev` field of `temp` to `null`.
        temp.prev = null;
    }
    // Decrement the `length` by 1 to indicate that the list has one less node.
    length--;
    // Return the `temp` node, which holds the value of the removed last node.
    return temp;
}
