/*

This code defines a method called findKthFromEnd inside a LinkedList class,
which takes an integer k as input and returns the kth node from the end of
the LinkedList.



    1. The method initializes two pointers, slow and fast, both pointing
       to the head of the LinkedList.

    2. It then moves the fast pointer k steps ahead in the LinkedList.
       If fast becomes null at any point during this process, it means 
       that k is out of bounds (greater than the length of the LinkedList), 
       so the method returns null.

    3. After moving the fast pointer k steps ahead, the method enters a
       while loop. This loop continues until the fast pointer reaches the
       end of the LinkedList (i.e., fast becomes null).

    4. Inside the while loop, both the slow and fast pointers move one step
       at a time. Since the fast pointer is already k steps ahead of the slow 
       pointer, when the fast pointer reaches the end of the LinkedList, 
       the slow pointer will be at the kth node from the end.

    5. Finally, the method returns the slow pointer, which now points to
       the kth node from the end of the LinkedList.

*/


public Node findKthFromEnd(int k) {
    Node slow = head; // Initialize slow pointer at head
    Node fast = head; // Initialize fast pointer at head
 
    // Move fast pointer k steps ahead
    for (int i = 0; i < k; i++) {
        if (fast == null) { // If k is out of bounds, return null
            return null;
        }
        fast = fast.next; // Move the fast pointer to the next node
    }
 
    // Move both pointers until fast reaches the end
    while (fast != null) {
        slow = slow.next; // Move the slow pointer to the next node
        fast = fast.next; // Move the fast pointer to the next node
    }
 
    return slow; // Return the kth node from the end (slow pointer)
}
