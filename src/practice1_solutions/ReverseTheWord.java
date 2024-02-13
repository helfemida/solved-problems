package practice1_solutions;

import java.util.Scanner;

public class ReverseTheWord {
    /*
    You are given String line, your task is to reverse the word.

    Example 1:
    Input: line = "Hello!"
    Output: "!olleH"

    Example 2:
    Input: line = "I love Java even tho its hard"
    Output: "drah sti oht neve avaJ evol I

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the line: ");
        String line = in.nextLine();

        String ans = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            ans += (line.charAt(i) + "");
        }

        System.out.println(ans);

    }
}

