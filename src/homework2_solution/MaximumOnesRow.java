package homework2_solution;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOnesRow {
    /*
    [EN]
    You are given 2d integer array filled with 0's and 1's.
    Your task is to return the row with the maximum number of 1's

    if there are equal number of 1's in all rows, return -1;

    Example:
    Input: [[1, 0, 1, 0], [0, 0, 0, 0], [1, 1, 1, 0], [0, 0, 1, 0]];
    Output: [1, 1, 1, 0]

    Input: [[0, 0, 1, 0, 0, 0], [0, 1, 0, 0, 0, 0], [1, 0, 0, 0, 0, 0]]
    Output: -1

    [RU]
    Вам дается двумерный массив, состоящий их 0 и 1.
    Ваша задача вернуть ряд, в котором содержится
    максимальное количество 1, если такой ряд отсутствует
    (во всех рядах количество 1 одинаково) то вернуть -1.

    Ввод: [[1, 0, 1, 0], [0, 0, 0, 0], [1, 1, 1, 0], [0, 0, 1, 0]];
    Вывод: [1, 1, 1, 0]

    Ввод: [[0, 0, 1, 0, 0, 0], [0, 1, 0, 0, 0, 0], [1, 0, 0, 0, 0, 0]]
    Вывод: -1
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] nums = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }

        System.out.println(Arrays.toString(maxOnesRow(nums)));
    }

    public static int[] maxOnesRow(int[][] nums) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;

        int equalRows = 1;

        int indexRow = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 1) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
                indexRow = i;
            } else if (cnt == max) {
                equalRows++;
            }
            cnt = 0;
        }

        if (equalRows == nums.length) {
            return new int[]{-1};
        }
        return nums[indexRow];
    }
}
