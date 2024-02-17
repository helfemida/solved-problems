package homework2_solution;

import java.util.Scanner;

public class MissingInteger {
    /*
    [EN]
    Given an integer array arr[] with length
    N-1 with the numbers in it in range [1, N];
    Find the missing integer in this sequence of numbers;

    Note: there will be no duplicate numbers

    Example:

    Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
    Output: 5
    Explanation: The size of the array is 7,
    hence the numbers will be in [1, N].
    The missing number between 1 and 8 is 5;

    [RU]
    Дан массив arr[] размером N-1 с целыми числами в диапазоне [1, N].
    Задача состоит в том, чтобы найти отсутствующее число среди N целых чисел.

    Примечание: В списке не будет повторяющихся чисел.

    Ввод: arr[] = {1, 2, 4, 6, 3, 7, 8}
    Вывод: 5
    Объяснение: Здесь размер массива равен 7,
    поэтому диапазон будет [1, 8]. Отсутствующее число между 1 и 8 - это 5.


     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(findMissing(nums));
    }
    public static int findMissing(int[] nums){
        boolean[] was = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            was[nums[i] - 1] = true;
        }

        for (int i = 0; i < was.length; i++) {
            if(!was[i]){
                return i + 1;
            }
        }
        return -1;
    }
}
