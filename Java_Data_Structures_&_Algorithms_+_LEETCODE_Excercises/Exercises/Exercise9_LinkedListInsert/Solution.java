/*

Make sure the first if statement is like this:
if (index < 0 || index > length)

Not like this:
if (index < 0 || index > length-1)

Or this:
if (index < 0 || index >= length)


Consider this Linked List:

1 -> 2 -> 3 -> 4


The indexes are 0-3. 

If you inserted an item at the end (append) it would be added at the 
index of 4 (equal to the length).

Any index of 5 or greater would be invalid (greater than the length).




The insert method takes an index and a value as parameters, and it inserts
a new node with the given value at the specified index in the linked list. 
The method returns true if the insertion is successful, and false otherwise.

The method first checks if the index is valid by making sure it is between 0 
and the length of the linked list (inclusive). If the index is not valid, the
method returns false.

If the index is 0, the method uses the prepend method to add a new node with 
the given value at the beginning of the linked list, and returns true.

If the index is equal to the length of the linked list, the method uses the append 
method to add a new node with the given value at the end of the linked list, and 
returns true.

If the index is not 0 or equal to the length of the linked list, the method creates
a new node with the given value, and calls the get method  to get a pointer to the 
node at the index before the desired index.

The next pointer of the new node is then set to the next pointer of the previous node,
and the next pointer of the previous node is set to the new node.  The length of the
linked list is incremented, and the method returns true.

*/


public boolean insert(int index, int value)  {
    // Check if the index is valid
    if (index < 0 || index > length) return false;
    
    // If the index is 0, insert at the beginning of the list
    if (index == 0) {
        prepend(value);
        return true;
    }
    
    // If the index is at the end, insert at the end of the list
    if (index == length) {
        append(value);
        return true;
    }
    
    // If the index is in the middle, insert the node
    // Create the new node
    Node newNode = new Node(value);
    
    // Get a pointer to the node at the previous index
    Node temp = get(index - 1);
    
    // Insert the new node by updating the next pointers
    newNode.next = temp.next;
    temp.next = newNode;
    
    // Update the length of the list
    length++;
    
    // Return true to indicate successful insertion
    return true;
}
