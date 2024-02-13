package homework1;

import java.util.Scanner;

public class IntersectionArray {
    /*
    Given two integer arrays nums1 and nums2,
    return an array of their intersection.
    Each element in the result must be unique
    and you may return the result in any order.

    Example 1:
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]

    Example 2:
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Explanation: [4,9] is also accepted.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First array size: ");
        int n = in.nextInt();

        int[] nums1 = new int[n];

        System.out.print("Second array size: ");
        int m = in.nextInt();

        int[] nums2 = new int[m];

        System.out.print("First array numbers: ");
        for (int i = 0; i < n; i++) {
            nums1[i] = in.nextInt();
        }

        System.out.print("Second array numbers: ");
        for (int i = 0; i < n; i++) {
            nums2[i] = in.nextInt();
        }

        //create getIntersection() and use it for nums1 and nums2 arrays
    }

    //implement your getIntersection() method here

}
