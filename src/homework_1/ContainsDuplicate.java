package homework_1;

import java.util.Scanner;

public class ContainsDuplicate {
    /*
    Given an integer array nums,
    return true if any value
    appears at least twice in the array,
    and return false if every element is distinct.

    Example 1:
    Input: nums = [1,2,3,1]
    Output: true

    Example 2:
    Input: nums = [1,2,3,4]
    Output: false

    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of the array:");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.print("Elements: ");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        //create containsDuplicate() method and use it for the array nums
    }

    //method containsDuplicate()

}
