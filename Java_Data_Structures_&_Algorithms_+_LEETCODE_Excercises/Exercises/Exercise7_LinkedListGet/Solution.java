/*

Make sure the if statement is like this:
if (index < 0 || index >= length)

Not like this:
if (index < 0 || index >= length-1)

Or this:
if (index < 0 || index > length)


Consider this Linked List:

1 -> 2 -> 3 -> 4


The only valid indexes are 0-3. 

You cannot get a node at the index of 4 or any index greater than 
4 (greater than or equal to the length).




The get(int index) method returns a pointer to the node at a specified index in the linked list.

The method first checks if the specified index is out of bounds. If the index is less 
than 0 or greater than or equal to the length of the linked list, the method immediately returns null.

If the specified index is within bounds, the method starts at the head of the linked 
list and traverses the linked list until the node at the desired index is reached. 
This is done using a for loop that iterates over the linked list by following the 
next instance variable of each node until the desired node is reached.

Finally, the method returns a pointer to the node at the specified index.

*/


public Node get(int index) {
    // if the index is less than 0 or greater than or equal to the length of the linked list, return null
    if (index < 0 || index >= length) return null;
    // start at the head of the linked list
    Node temp = head;
    // traverse the linked list until the desired node is reached
    for(int i = 0; i < index; i++) {
        temp = temp.next;
    }
    // return the pointer to the node at the desired index
    return temp;
}
