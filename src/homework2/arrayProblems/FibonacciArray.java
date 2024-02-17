package homework2.arrayProblems;

import java.util.Arrays;

public class FibonacciArray {
    /*
    [EN]
    you are given integer array nums[] with length N.
    Fill the arrays every nums[i] with corresponding fibonacci number;

    Example:

    Input: N = 4;
    Output: [0, 1, 1, 2]

    Input: N = 11;
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
        int n = 11;

        System.out.println(Arrays.toString(fibonacciArray(n)));

    }

    public static int[] fibonacciArray(int n) {
        // n == 1, n == 2
        if(n == 1){
            return new int[]{1};
        }
        else if(n == 2){
            return new int[]{0, 1};
        }
        int[] nums = new int[n];

        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < n; i++) {
            nums[i] = nums[i-2] + nums[i-1];
        }
        return  nums;
    }
}
