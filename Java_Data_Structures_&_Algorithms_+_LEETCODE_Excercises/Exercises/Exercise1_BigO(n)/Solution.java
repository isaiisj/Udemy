/*

1. public static void printItems(int n): This is the declaration of 
   a method named printItems which is public (meaning that it can be 
   accessed from anywhere), static (meaning that it belongs to the class itself,
   not to an instance of the class), and void (meaning that it doesn't return any value). 
   This method takes one parameter, an integer n.

2. for (int i = 0; i < n; i++): This is a for loop. The for loop is a control flow 
   statement for specifying iteration, which allows code to be repeatedly executed. In this loop:

      int i = 0; is the initialization. 
      It's executed once at the beginning of the loop. 
      Here, a variable i is declared and initialized to 0.

      i < n; is the condition. Before every iteration of the loop,
      this condition is checked. If the condition is true, the loop executes.
      If the condition is false, the loop ends and the program continues 
      with the code that follows the loop. Here, the condition is that i must be less than n.

      i++ is the iteration expression. It's executed after every iteration.
      Here, i++ increments the value of i by 1 after each iteration.

3. System.out.println(i);: This line of code is the body of the for loop, which is 
   executed on each iteration as long as the condition i < n is true. System.out.println(i) prints 
   the value of i followed by a new line.

So overall, the printItems method prints the numbers from 0 to n-1 (inclusive) to the console,
each on a new line. The number of lines printed is determined by the input n.

*/


public static void printItems(int n) {
    // We are defining a static method, printItems. Static
    // means this method belongs to the class, not an instance.
    // It takes one integer parameter, n.
    
    for (int i = 0; i < n; i++) {
        // This is a for loop. It initializes an integer i to 0.
        // It continues looping as long as i is less than n.
        // After each iteration, it increments i by 1 (i++).
 
        System.out.println(i);
        // Inside the loop, we print the current value of i.
        // This is done for each iteration of the loop,
        // hence printing numbers from 0 to n-1 inclusive.
    }
}
