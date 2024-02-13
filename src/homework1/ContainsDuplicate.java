package homework1;

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

    i = 0, j = 0
    nums[0] = 1; nums[0] = 1
     count = 1;
     i = 0, j = 1;
     nums[0] = 1, nums[1] = 1
     count = 2;


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

        System.out.println(containsDuplicate(nums));
        //create containsDuplicate() method and use it for the array nums
    }
    //method containsDuplicate()
    public static boolean containsDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int count = 0; //счет
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count >= 2){
                return true;
            }
            count = 0;
        }
        return false;
    }
}