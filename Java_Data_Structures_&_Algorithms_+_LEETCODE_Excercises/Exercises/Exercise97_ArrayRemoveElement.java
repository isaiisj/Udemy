/*

In this problem, we are given an array of integers nums and a value val. 
The goal is to remove all occurrences of val in-place from the array and return the new length of the array after removal.

The method removeElement(int[] nums, int val) takes an array of integers nums and an integer val as input.
It modifies the nums array in-place to remove all instances of val and returns the new length of nums after the removal.

It's important to note that the order of elements can be changed. We don't need to consider elements beyond the new length.

For example, given nums = [3,2,2,3] and val = 3, the method should return 2, and the first two elements of nums should be 2.



Method Signature:

    public static int removeElement(int[] nums, int val)


Constraints

    The array nums can contain negative and positive numbers, and 0.



Example

Let's illustrate the problem using an example:

    Input:

        nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

        val = 1

    Output: The new length of the array should be 7, 
    and the array itself should look like this after 
    modification: [-2, -3, 4, -1, 2, -5, 4, -5, 4]



We iterate over the nums array and, whenever we encounter a number that is not equal to val,
we shift it to the front of the array. By doing this, we can effectively remove all occurrences 
of val from the array and get the new length.

*/


import java.util.Arrays;


public class Main {

    // WRITE THE REMOVEELEMENT METHOD HERE //
     
    public static int removeElement(int[] nums, int val){
        //Create 2 pointers startin in 0
        int p1 = 0;
        int p2 = 0;

        //While p2 less than len - 1 (to avoid out of index error)
        while(p2 <= nums.length-1){
            //If p2 is not equal to the value
            if(nums[p2] != val){
                //Use aux pointer to store p2 and change p1 and p2
                int p3 = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = p3;
                p1++;
            }
            //If it is the value do nothing
            p2++;
        }
        //Return length of array without the values
        return p1;
    }
    
    /////////////////////////////////////////




    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        int newLength1 = removeElement(nums1, val1);
        System.out.println("Test case 1: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)) +
                           "\nNew length: " + newLength1);
                           
        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int val2 = 6;
        int newLength2 = removeElement(nums2, val2);
        System.out.println("Test case 2: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)) +
                           "\nNew length: " + newLength2);
                           
        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeElement(nums3, val3);
        System.out.println("Test case 3: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)) +
                           "\nNew length: " + newLength3);
    
        // Test case 4
        int[] nums4 = {};
        int val4 = 1;
        int newLength4 = removeElement(nums4, val4);
        System.out.println("Test case 4: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)) +
                           "\nNew length: " + newLength4);
    
        // Test case 5
        int[] nums5 = {1, 1, 1, 1, 1};
        int val5 = 1;
        int newLength5 = removeElement(nums5, val5);
        System.out.println("Test case 5: Modified array: " +
                           Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)) +
                           "\nNew length: " + newLength5);
    }

}
