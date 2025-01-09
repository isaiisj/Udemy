/*

In this code, the hasLoop method uses two pointers to traverse the linked list: 
slow and fast. The slow pointer moves one step at a time, while the fast pointer
moves two steps at a time. If there is a loop in the linked list, the slow and 
fast pointers will eventually meet, and the method will return true. If there is
no loop in the linked list, the fast pointer will eventually reach the end of the
list, and the method will return false.

FAQ

Question:
Why are fast != null and fast.next != null both necessary in the while loop?

Answer:
In the while condition, fast != null and fast.next != null are both necessary
to ensure that the code doesn't throw a NullPointerException.

Here's why each condition is necessary:

fast != null: This condition checks if the fast pointer has reached the end of the list.
If the list doesn't have a loop, the fast pointer will eventually reach the end of the 
list (i.e., it will become null).

fast.next != null: Since the fast pointer moves two nodes at a time, this condition 
checks if there is at least one more node after the current fast node before trying 
to move to the next node. If this condition wasn't there and fast was at the last node
in the list, trying to move two nodes ahead with fast.next.next would result in a
NullPointerException.

*/


public boolean hasLoop() {
    // Initialize slow pointer to the head of the linked list
    Node slow = head;
 
    // Initialize fast pointer to the head of the linked list
    Node fast = head;
 
    // Traverse the linked list with two pointers: slow and fast
    // slow moves one node at a time, while fast moves two nodes at a time
    while (fast != null && fast.next != null) {
        // Move slow pointer to the next node
        slow = slow.next;
 
        // Move fast pointer to the next two nodes
        fast = fast.next.next;
 
        // If slow pointer meets fast pointer, then there is a loop in the linked list
        if (slow == fast) {
            return true;
        }
    }
 
    // If the loop has not been detected after the traversal, then there is no loop in the linked list
    return false;
}
