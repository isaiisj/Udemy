/*

The removeFirst() method removes the first node from the linked list and returns it.

The method checks if the linked list is empty by checking if the length instance 
variable is 0 (you could also check to see if (head == null). If the linked list is empty, 
the method immediately returns null.

If the linked list is not empty, the method creates a variable that points to the same 
node that head points do named temp.  The head instance variable of the linked list is 
then updated to point to the next node in the linked list, effectively removing the original head node.

The next instance variable of the temp node is then set to null to remove the reference 
to the former head node. The length instance variable of the LinkedList object is decremented 
to reflect the removal of the head node from the linked list.

If the linked list is now empty (i.e., its length instance variable is 0), the tail 
instance variable is set to null, since there are no nodes left in the linked list.

Finally, the method returns the removed node, which is the original head node of 
the linked list that  temp is pointing to.

*/


public Node removeFirst() {
    // if the length of the linked list is 0, return null
    if (length == 0) return null;
    // save a reference to the current head node
    Node temp = head;
    // set the new head node to be the next node in the linked list
    head = head.next;
    // remove the reference to the former head node
    temp.next = null;
    // decrement the length of the linked list
    length--;
    // if the linked list is now empty, set tail to null
    if (length == 0) {
        tail = null;
    }
    // return the removed node
    return temp;
}
