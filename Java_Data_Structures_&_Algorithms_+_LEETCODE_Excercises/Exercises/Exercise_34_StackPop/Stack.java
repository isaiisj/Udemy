/*

Implement a pop method that removes and returns the top node from the stack.

Return type: Node (the node that was popped from the stack)



The method should perform the following tasks:

    1. If the height of the stack is 0, return null.

    2. Store the current top node in a temporary variable called temp.

    3. Update the top attribute to point to the next node in the stack.

    4. Set the next attribute of the temp node to null to disconnect it from the stack.

    5. Decrement the height attribute of the stack by 1.

    6. Return the temp node.

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

    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

	/// WRITE POP METHOD HERE ///
	
	public Node pop(){
	    
	    if(height == 0) return null;
	    
	    Node temp = top;
	    top = temp.next;
	    temp.next = null;
	    height--;
	    
	    return temp;
	}
	
	/////////////////////////////

}
