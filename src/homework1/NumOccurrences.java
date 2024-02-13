package homework1;

import java.util.Scanner;

public class NumOccurrences {
    /*
    Find the occurences of the number in array:
    Given a sorted array of n elements, possibly with duplicates, find the number of occurrences of the target element.

    Example 1:
    Input: arr = [4, 4, 8, 8, 8, 15, 16, 23, 23, 42], target = 8
    Output: 3

    Example 2:
    Input: arr = [3, 5, 5, 5, 5, 7, 8, 8], target = 6
    Output: 0

    Example 3:
    Input: arr = [3, 5, 5, 5, 5, 7, 8, 8], target = 5
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

        System.out.print("Target number: ");
        int target = in.nextInt();

        //create numberOccurrences() method and use it for the array nums and target
    }
    //method numberOccurrences()
}