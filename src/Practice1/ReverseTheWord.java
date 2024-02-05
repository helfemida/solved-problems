package Practice1;

import java.util.Scanner;

public class ReverseTheWord {
    /*
    You are given String line, your task is to reverse the line.

    Example 1:
    Input: line = "Hello!"
    Output: "!olleH"

    Example 2:
    Input: line = "I love Java even tho its hard"
    Output: "drah sti oht neve avaJ evol I

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        String res = "";

        for(int i = line.length() - 1; i >= 0; i--){
            //res += line.charAt(i);
            System.out.print(line.charAt(i));
        }
        //System.out.println(res);
    }
}

/*
Sabina
0: S
1: a
2: b
3: i
4: n
5: a

charAt(3) = i;
charAt(word.length() - 1) = a;
 */

