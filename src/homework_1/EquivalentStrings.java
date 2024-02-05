package homework_1;

import java.util.Scanner;

public class EquivalentStrings {
    /*
    Given two string arrays word1 and word2,
     return true if the two arrays represent
     the same string, and false otherwise.

    A string is represented by an array if
    the array elements concatenated in order forms the string.

    Example 1:
    Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    Output: true
    Explanation:
    word1 represents string "ab" + "c" -> "abc"
    word2 represents string "a" + "bc" -> "abc"
    The strings are the same, so return true.

    Example 2:
    Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
    Output: false

    Example 3:
    Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
    Output: true

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First array size: ");
        int n = in.nextInt();

        String[] word1 = new String[n];

        System.out.print("Second array size: ");
        int m = in.nextInt();

        String[] word2 = new String[m];

        System.out.print("First array words: ");
        for (int i = 0; i < n; i++) {
            word1[i] = in.next();
        }

        System.out.print("Second array words: ");
        for (int i = 0; i < n; i++) {
            word2[i] = in.next();
        }

        //create isEquivalentStrings() and use it for word1 and word2 arrays
    }

    //implement your isEquivalentStrings() method here
}
