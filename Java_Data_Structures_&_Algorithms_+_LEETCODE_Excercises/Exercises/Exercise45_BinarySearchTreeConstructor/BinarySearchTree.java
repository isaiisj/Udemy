/*

Create a simple binary search tree class called BinarySearchTree with a Node inner
class and a root attribute to hold the reference to the root node of the tree.



The class should include the following:

    1. A Node inner class with the following properties:

          An integer value.

          A reference to the left child node.

          A reference to the right child node.

          A constructor that takes an integer value and initializes the node with it.

    2. A root attribute that will store a reference to the root node of the tree.

*/


public class BinarySearchTree {

	// CREATE CLASS VARIABLE (ROOT) AND NODE CLASS HERE//
	
	private Node root;
	
	class Node{
	    
	    public int value;
	    public Node left;
	    public Node right;
	    
	    Node(int value){
	        this.value = value;
	    }
	}
	
	/////////////////////////////////////////////////////
	
	public Node getRoot() {
        return root;
    }

}