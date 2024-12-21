/*

The removeLast() method removes the last node of the linked list and returns it.

The method first checks if the length of the linked list is 0 (you could also 
check to see if (head == null) ), which means there are no nodes to remove, and 
in that case, it returns null.

Otherwise, the method starts at the head node and iterates through the linked list
until it reaches the second-to-last node, which is the node that points to the last node.

Once the second-to-last node is found, the tail instance variable of the LinkedList object
is pointed to it, and its next reference is set to null. This effectively removes the last 
node from the linked list.

The length instance variable of the LinkedList object is then decremented, and if the length 
of the linked list is now 0, the head and tail instance variables are set to null.

Finally, the method returns the removed node, which is the original tail node.

*/


public Node removeLast() {
    // if the length of the linked list is 0, return null
    if (length == 0) return null;
 
    // start at the head node
    Node temp = head;
    Node pre = head;
    // iterate through the linked list until the last node is reached
    while(temp.next != null) {
        pre = temp;  // keep track of the second-to-last node
        temp = temp.next;
    }
    // set the new tail node to be the second-to-last node
    tail = pre;
    // remove the reference to the former tail node
    tail.next = null;
    // decrement the length of the linked list
    length--;
    // if the linked list is now empty, set head and tail to null
    if (length == 0) {
        head = null;
        tail = null;
    }
    // return the removed node
    return temp;
}
