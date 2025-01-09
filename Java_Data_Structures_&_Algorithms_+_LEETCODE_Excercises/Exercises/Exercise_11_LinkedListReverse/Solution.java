/*

This is a method that reverses the linked list by changing the order of the nodes in the list.
The method starts by swapping the head and tail nodes of the list, which effectively reverses 
the direction of the list.

After swapping the head and tail nodes, the method then uses a loop to iterate through the nodes
in the list and reverse the order of the links between the nodes. It does this by keeping track 
of three nodes: the current node (which starts as the original head node), the node before the 
current node (which starts as null), and the node after the current node.

On each iteration of the loop, the method updates the "before" and "after" nodes to be the next
nodes in the list (i.e., the nodes immediately before and after the current node), and then 
changes the "next" pointer of the current node to point to the "before" node. It then updates 
the "before" node to be the current node, and the "current" node to be the "after" node, and 
continues the loop.

By the time the loop finishes iterating through all the nodes in the list, the order of the
links between the nodes will have been reversed, effectively reversing the entire list.

*/


public void reverse() {
	// Set temp to the current head of the linked list
    Node temp = head;  
    // Set the new head to be the current tail       
    head = tail;  
    // Set the new tail to be the previous head (stored in temp)           
    tail = temp;     
    
    // Set after to be the next node after the current head        
    Node after = temp.next;  
    // Initialize before to null, as the first node in the reversed list will not have a previous node
    Node before = null;  
    
    // Loop through the linked list, reversing the order of the nodes    
    for (int i = 0; i < length; i++) { 
    	// Set after to be the next node after the current node
        after = temp.next; 
        // Set the current node's next pointer to the previous node  
        temp.next = before; 
        // Set before to be the current node, as it will be the previous node in the next iteration of the loop 
        before = temp;  
        // Set temp to be the next node in the linked list     
        temp = after;        
    }
}
