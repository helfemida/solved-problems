package homework_1;

import java.util.Scanner;

public class KthLargest {
    /*
    Given an integer array nums and an
    integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Can you solve it without sorting?

    Example 1:

    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5
    Example 2:

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
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

        System.out.print("K: ");
        int k = in.nextInt();

        //create kthLargest() method and use it for the array nums and k
    }
    //method kthLargest()
}

