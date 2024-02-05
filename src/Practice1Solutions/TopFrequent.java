package Practice1Solutions;

import java.util.Arrays;
import java.util.Scanner;

public class TopFrequent {
    /*
    Given array nums with the size n,
    print the top k biggest
    elements from the array

    Example 1:
    Input: nums = [1,2,4,6,2,1,4,6,2], k = 2
    Output: [6 6]

    Example 2:
    Input: nums = [7,4,6,1,4,8], k = 1
    Output: [8]

    Example 2:
    Input: nums = [1 7 5 3 6 9 4], k = 2
    Output: [9 7]
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Enter the k: ");
        int k = in.nextInt();

        Arrays.sort(nums);

        int i = nums.length - 1;

        while(k > 0){
            System.out.print(nums[i] + " ");
            k--;
            i--;
        }
    }
}
