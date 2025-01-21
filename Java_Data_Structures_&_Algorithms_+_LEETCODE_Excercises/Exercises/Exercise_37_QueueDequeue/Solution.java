/*

The dequeue() method removes the first node (i.e., the front)
from the queue and returns it.



    The first if statement checks if the queue is empty by checking
    the length variable.  If the length is 0, it returns null, indicating 
    that there are no nodes in the queue to remove.

    The next line Node temp = first creates a temporary variable temp
    that holds a reference to the first node in the queue.

    The second if statement checks if the queue has only one node. 
    If it does, it sets both first and last to null. This is because
    the queue will be empty after this operation.

    The else block is executed when there are two or more nodes in
    the queue. In this case, the first node is set to the next node
    in the queue, and the temp node is disconnected from the queue 
    by setting its next reference to null.

    The length variable is decremented to reflect the removal of the node.

    Finally, the temp variable, which holds a reference to the removed node, is returned.

*/


public Node dequeue() {
    // If the queue is empty, return null
    if(length == 0) return null;
    // Save a reference to the first node
    Node temp = first;
    // If there is only one node in the queue, set both first and last to null
    if(length == 1) {
        first = null;
        last = null;
    } else {
        // Otherwise, set the first node to be the next node in the queue
        first = first.next;
        // Set the next pointer of the removed node to null
        temp.next = null;
    }
    // Decrease the length of the queue by 1
    length--;
    // Return the removed node
    return temp;
}
