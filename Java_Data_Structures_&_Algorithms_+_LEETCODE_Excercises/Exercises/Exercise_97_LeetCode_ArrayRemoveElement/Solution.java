/*

This method, removeElement, is designed to "remove" all instances of a specific value (val)
from an array of integers (nums). However, the removal process doesn't actually delete the 
elements from the array itself. It rather reorganizes the array so that all the elements that 
are not equal to val are moved to the front of the array.

Here's how it works:

  1. We initialize a variable i at 0. This variable is used to keep track 
     of the position where we would put the next number that is not equal to val.

  2. We then use a for loop to traverse through the nums array. The loop variable 
     j is initialized to 0 and runs up to nums.length - 1, which are the index positions 
     of the array.

  3. Inside the for loop, we use an if statement to check whether the current element 
     of the array nums[j] is not equal to val.

  4. If nums[j] is not equal to val, we assign the value of nums[j] to nums[i] and 
     increment i by 1. This effectively "moves" the value from position j to position i, 
     ensuring that val is not in the first i elements of the array.

  5. If nums[j] is equal to val, we do nothing and just move to the next element in the array.
     This effectively "skips" the unwanted val elements.

  6. Once the loop finishes traversing through all the elements in the array, the first i elements
     of nums are all the elements which are not equal to val, and the elements from position i to 
     the end of the array are unchanged.

  7. Finally, the function returns i, which is the number of elements that are not equal to val.



This is useful if you want to use this array later, but you want to ignore the "removed" values. 
This function gives you the effective length of the new array (i), and you would only process the array up to that length.

Let's consider an example: If the nums array is [3,2,2,3] and val is 3, then after running this function, 
  the nums array will become [2,2,3,3] and the function will return 2. So the first 2 elements of nums are all 
  the elements which are not 3, and you would ignore the rest of the array.

*/


public static int removeElement(int[] nums, int val) {
    // Initialize index i for writing elements in the array
    int i = 0;
    
    // Traverse the array from the start to end
    for (int j = 0; j < nums.length; j++) {
        // If the current element is not equal to the given value...
        if (nums[j] != val) {
            // ...copy it to the position of the 'write' index i...
            nums[i] = nums[j];
            // ...and increment the write index
            i++;
        }
        // If the current element equals val, it is skipped
    }
    
    // Return the number of elements not equal to val
    return i;
}
