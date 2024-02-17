package homework2_solution;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {
    /*
    [EN]
    You are given an integer array nums[] with length n.
    Return indexes i and j, where nums[i] + nums[j]
    is the maximum sum in the array and i != j;

    Input: nums = [1, 5, 2, 6, 7, 3, 8, 9, -1, 0]
    Output: [6, 7]

    [RU]
    Дан массив nums размером n. Верните индексы
    элементов i, j, таких что бы сумма nums[i] + nums[j]
    было максимальной, где i != j. Вы можете вернуть
    ответ в любом порядке.

    Ввод: nums = [1, 5, 2, 6, 7, 3, 8, 9, -1, 0]
    Вывод: [6, 7]

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(maxSum(nums)));
    }

    public static int[] maxSum(int[] nums){
        int max = Integer.MIN_VALUE;

        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] > max){
                    max = nums[i] + nums[j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new int[]{index1, index2};
    }
}
