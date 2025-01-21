/*

This code defines the pop method for a stack implemented
using an ArrayList of type T (generic).

The pop method removes the last element from the stackList
and returns it.  If the stackList is empty, the method returns
null.

The method first checks if the stackList is empty by calling 
the size() method of the list.  If the size is 0, the method
returns null.

If the stackList is not empty, the method calls the remove() 
method of the list to remove the last element from the list,
and returns that element.  The index of the last element in the
list is stackList.size() - 1 since the list is zero-indexed.

*/


// Removes and returns the top element from the stack
public T pop() {
    // Check if the stack is empty, if so return null
    if (isEmpty()) return null;
    // Removes the element from the end of the list
    // (which is the top of the stack) and returns it
    return stackList.remove(stackList.size() - 1);
}
