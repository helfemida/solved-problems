package practice_1;

import java.util.Arrays;
import java.util.Scanner;

public class TopFrequent {
    /*

    Given array nums print the top k biggest
    elements from the array

    Example 1:
    Input: nums = [1,2,4,6,2,1,4,6,2], k = 2
    Output: [6, 6]

    Example 2:
    Input: nums = [7,4,6,1,4,8], k = 1
    Output: [8]

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int[] ar = new int[b];
        int k = in.nextInt();
        for (int i = 0; i <= b; i++) {
            ar[i] = in.nextInt();
        }
        Arrays.sort(ar);
        for (int i = b - 1; i >= 0; i--) { // i = 10 , i >= 0 i--; 10,9,8
            if (k > 0) {
                System.out.print(ar[i] + " ");
                k -= 1;
            } else {
                break;
            }
        }

    }
}


