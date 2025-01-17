/*

In the Stack: Intro video we discussed how stacks are commonly 
implemented using an ArrayList instead of a Linked List.

Write the push method to add an item onto a stack that is 
implemented with an ArrayList.

We will modify the Stack class to be able to store multiple data
types by using a generic parameter type <T>. This will allow the
class to hold Integers, Characters or any other data type.

Return type: void

*/


import java.util.ArrayList;

public class Stack<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
    // WRITE PUSH METHOD HERE //
    
    public void push(T item){
        stackList.add(item);
    }
    
    ////////////////////////////
    
}
