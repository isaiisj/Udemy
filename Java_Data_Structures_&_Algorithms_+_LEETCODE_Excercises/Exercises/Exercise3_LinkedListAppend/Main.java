/*

Implement the append method that appends a new node to the end of the linked list.

Return type: void


The method should perform the following tasks:

1. Accept an integer value as an argument, which will be the value of the new node.

2. Create a new Node object called newNode with the given value.

3. If the length of the linked list is 0, set both the head and tail pointers of the list to the newNode.

4. If the length of the linked list is greater than 0, perform the following tasks:

    - Set the next attribute of the current tail node to the newNode.

    - Update the tail pointer of the list to point to the newNode.

5. Increment the length attribute of the list by 1.

*/


public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);


        myLinkedList.printAll();
        
        
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2
        
        	Linked List:
        	1
        	2
        
     	*/

    }
    
}
