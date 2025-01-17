/*

This code defines a method called push that takes a 
generic value (T) as its input parameter. 

The purpose of the method is to add the given value
to the top of the stack, which is represented by an
ArrayList called stackList. 

The add method of ArrayList is used to add the value
to the end of the ArrayList, which corresponds to the
top of the stack. 

Therefore, this method can be used to push new elements
onto the stack.

*/


public void push(T value) {
    // add the given value to the end of the stackList
    stackList.add(value);
}
