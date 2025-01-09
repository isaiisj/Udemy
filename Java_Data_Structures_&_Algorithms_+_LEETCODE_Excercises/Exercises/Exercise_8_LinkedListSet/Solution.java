/*

The set(int index, int value) method sets the value of the 
node at the specified index in the linked list.

The method first calls the get(int index) method to retrieve a 
pointer to the node at the specified index. If the get method 
returns null (which means the index is out of bounds), the set 
method returns false.

If the get method returns a pointer to a valid node, the method
sets the value of that node to the specified value and returns true.

*/


public boolean set(int index, int value) {
    // retrieve the node at the specified index
    Node temp = get(index);
 
    // if the index is out of bounds, return false
    if (temp != null) {
        // if the node is found, set the value of the node
        temp.value = value;
        // return true to indicate that the value was set successfully
        return true;
    }
    // return false if the index is out of bounds
    return false;
}
