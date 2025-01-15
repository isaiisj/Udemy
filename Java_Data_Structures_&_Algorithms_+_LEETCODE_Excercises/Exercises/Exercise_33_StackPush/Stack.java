/*

Implement a push method that adds a new node with a given value to the top of the stack.

Return type: void



The method should perform the following tasks:

    1. Accept an integer value as an argument, which will be the value of the new node.

    2. Create a new Node object called newNode with the given value.

    3. If the height of the stack is 0, set the top attribute to the newNode.

    4. If the height of the stack is greater than 0, perform the following tasks:

        Set the next attribute of the newNode to the current top node.

        Update the top attribute to point to the newNode.

    5. Increment the height attribute of the stack by 1.

*/


public class Stack {

    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }
    
    public void makeEmpty() {
        top = null;
        height = 0;
    }

	/// WRITE PUSH METHOD HERE ///
	
	public void push(int value){
	    
	    Node newNode = new Node(value);
	    
	    if (height == 0){
	        top = newNode;
	    }else{
	        newNode.next = top;
	        top = newNode;
	    }
	    
	    height++;
	    
	}
	
	//////////////////////////////

}
