/*

The push method is used to add elements to the top of the stack.

The method first creates a new Node object with the given value. 
It then checks if the stack is empty by testing if height is 0.  
If the stack is empty, it sets the new Node as the top element of
the stack.  If the stack is not empty, it sets the next pointer of
the new Node to point to the previous top element, and then sets
the new Node as the top element of the stack.

Finally, the height variable is incremented to reflect the addition
of a new element to the stack.

*/


public void push(int value) {
    // Create a new node with the given value
    Node newNode = new Node(value);
    // If the stack is empty, set the new node as the top
    if(height == 0) {
        top = newNode;
    } else {
        // Otherwise, set the next node of the new node as the current top node,
        // and then set the new node as the new top node
        newNode.next = top;
        top = newNode;
    }
    // Increase the height of the stack by 1
    height++;
}
