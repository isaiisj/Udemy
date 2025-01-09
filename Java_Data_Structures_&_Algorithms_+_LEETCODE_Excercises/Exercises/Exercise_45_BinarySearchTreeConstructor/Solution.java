/*

The BinarySearchTree class has a single field root of type Node, 
which represents the root of the tree.  The Node class represents 
a node in the binary search tree and has three fields: value of type
int, left of type Node, and right of type Node.  The value field stores
the value of the node, while the left and right fields represent the
left and right subtrees of the node, respectively.

The Node class also has a constructor that takes an int value and sets
the value field of the node to the provided value.

Note that the Node class is defined as an inner class within the BinarySearchTree
class, which means that instances of Node can only be created within instances of
BinarySearchTree. 

*/


public class BinarySearchTree {
 
    // The root node of the binary search tree
    private Node root;
 
    // The Node class represents a node in the binary search tree
    class Node {
        // The value stored in the node
        public int value;
        // The left subtree of the node
        public Node left;
        // The right subtree of the node
        public Node right;
 
        // Constructor that takes an int value and sets the value of the node
        Node(int value) {
            this.value = value;
        }
    }
    
    // Get the root node of the binary search tree
    public Node getRoot() {
        return root;
    }
 
}
