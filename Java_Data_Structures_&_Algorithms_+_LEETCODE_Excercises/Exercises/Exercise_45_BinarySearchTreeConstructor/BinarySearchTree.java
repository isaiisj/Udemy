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
