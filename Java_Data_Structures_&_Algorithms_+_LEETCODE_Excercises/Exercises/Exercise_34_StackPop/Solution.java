/*

The pop method is used to remove the topmost node from the stack and return it.

First, the method checks if the stack is empty by checking if the height is equal
to 0.  If it is, the method returns null, indicating that the stack is empty.

If the stack is not empty, the top node is assigned to a temporary node temp.
Then, the top node is set to be the node next to the current top node.  
This effectively removes the current top node from the stack.

Finally, the temp.next is set to null to sever the connection to the rest of 
the stack, the height of the stack is decremented, and the temp node is returned,
effectively removing the top node from the stack and returning it.

*/


public Node pop() {
    // if the stack is empty, return null
    if(height == 0) return null;
 
    // create temporary variable that points to top node
    Node temp = top;
    // set the new top to point to the next node in the stack
    top = top.next;
    // set the next pointer of the temporary node to null
    temp.next = null;
 
    // decrease the height of the stack
    height--;
    // return the popped node
    return temp;
}
