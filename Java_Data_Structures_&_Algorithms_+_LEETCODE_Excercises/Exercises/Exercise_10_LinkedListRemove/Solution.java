/*
Make sure the first if statement is like this:
if (index < 0 || index >= length)

Not like this:
if (index < 0 || index >= length-1)

Or this:
if (index < 0 || index > length)


Consider this Linked List:

1 -> 2 -> 3 -> 4


The only valid indexes are 0-3. 

You cannot remove a node at the index of 4 or any index greater 
than 4 (greater than or equal to the length).




The remove method is used to remove the node at a given index in the linked list.
The method first checks if the given index is out of bounds or not.  If it is out
of bounds, it returns null.

If the given index is the index of the first node in the linked list, 
it simply calls the removeFirst method to remove the first node and returns
the removed node.

If the given index is the index of the last node in the linked list, it calls the
removeLast method to remove the last node and returns the removed node.

If the given index is for a node that is not the first or last node, it creates a
variable called prev and points it at the previous node of the node to be removed. 
Then, it creates a variable called temp and points it to the node to be removed.

The method then sets the prev node's next pointer to the node that comes after the
temp node, effectively removing the temp node from the linked list. It sets the temp
node's next pointer to null, updates the length of the linked list, and returns the
removed node.

*/


// Remove the node at the specified index in the list
public Node remove(int index) {
    // Check if the index is out of bounds
    if (index < 0 || index >= length) return null;
    // If the index is 0, remove the first node in the list
    if (index == 0) return removeFirst();
    // If the index is the last one in the list, remove the last node
    if (index == length - 1) return removeLast();
 
    // Get the previous node of the one to be removed
    Node prev = get(index - 1);
    // Get the node to be removed
    Node temp = prev.next;
 
    // Update the previous node's pointer to skip over the removed node
    prev.next = temp.next;
    // Detach the removed node from the list
    temp.next = null;
    // Decrease the length of the list
    length--;
    // Return the removed node
    return temp;
}
