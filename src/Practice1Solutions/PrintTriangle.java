package Practice1Solutions;

import java.util.Scanner;

public class PrintTriangle {
    /*
    Given an integer number n, print a triangle
    with n rows.

    Example 2:
    Input: 4
    Output:
            *
            * *
            * * *
            * * * *
     */
    public static void main(String[] args) {

        int row = new Scanner(System.in).nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
