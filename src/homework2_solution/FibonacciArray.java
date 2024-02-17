package homework2_solution;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciArray {
    /*
    [EN]
    you are given integer array nums[] with length N.
    Fill the arrays every nums[i] with corresponding fibonacci number;

    Example:

    Input: N = 4;
    Output: [0, 1, 1, 2]

    Input: N = 15;
    Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

    [RU]
    Дано целое число N - размер массива nums.
    Для каждой ячейки nums[i] верните его фибоначчи.

    Фибоначчи - элементы числовой последовательности,
    в которой первые два числа равны 0 и 1,
    а каждое последующее число равно сумме двух предыдущих чисел.

    Пример:
    Ввод: N = 4;
    Вывод: [0, 1, 1, 2]

    Ввод: N = 11;
    Вывод: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = fibonacciArray(n);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] fibonacciArray(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        if (n == 2) {
            return new int[]{1, 1};
        }

        int[] fibArray = new int[n];

        fibArray[1] = 1;

        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }

        return fibArray;
    }
}
