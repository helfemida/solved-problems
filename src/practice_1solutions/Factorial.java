package practice_1solutions;

import java.util.Scanner;

public class Factorial {
    /*
    you are given an Integer number,
    print its factorial.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        System.out.println(res);
    }
}
