package homework_1;

import java.util.Scanner;

public class TwoSum {
    /*
    Given an array of integers
    nums and an integer target,
    return indices of the two numbers
    such that they add up to target.

    You may assume that each input
    would have exactly one solution,
    and you may not use the same element twice.

    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]

    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
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

        System.out.print("Target sum: ");
        int target = in.nextInt();

        //create twoSum() method and use it for the array nums and target
    }
    //method twoSum()
}
