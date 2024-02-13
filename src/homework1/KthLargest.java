package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {
    /*

    Given an integer array nums and an
    integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

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

        System.out.println(kthLargest(nums, k));
    }
    //method kthLargest()

    public static int kthLargest(int[] nums, int k){
        Arrays.sort(nums);
        // 1 2 3 4 5 6
        // k = 2, k--, k = 1

        // n.length - k,
        int num = nums[0];

        for(int i = nums.length - 1; i >= 0; i--){
            if( k == 1 ){
                num = nums[i];
            }
            k--;
        }


        return num;
    }
}

