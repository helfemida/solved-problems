package practice_1;

import java.util.Scanner;

public class PrintTriangle {
    /*
    Given an integer number n, print a triangle
    with n rows.

    Example 1:
    Input: 4
    Output:
            *
            * *
            * * *
            * * * *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
