package homework1;

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


    1. Word1 concat, Word2 concat
    2. word1 ten ba ten emes pe word2

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First array size: ");
        int n = in.nextInt();

        String[] word1 = new String[n];

        System.out.print("Second array size: ");
        int m = in.nextInt();

        String[] word2 = new String[m];

        System.out.println("First array words: ");
        for (int i = 0; i < n; i++) {
            word1[i] = in.next();
        }

        System.out.println("Second array words: ");
        for (int i = 0; i < m; i++) {
            word2[i] = in.next();
        }

        System.out.println(isEquivalentStrings(word1, word2));
    }

    //implement your isEquivalentStrings() method here

    public static boolean isEquivalentStrings(String[] word1, String[] word2){
        String qosylgan1 = "";

        for (int i = 0; i < word1.length; i++) {
            qosylgan1 += word1[i];
        }

        String qosylgan2 = "";

        for (int i = 0; i < word2.length; i++) {
            qosylgan2 += word2[i];
        }

//        if (qosylgan1.equals(qosylgan2)){
//            return true;
//        }
//        else{
//            return false;
//        }

        return qosylgan1.equals(qosylgan2);
    }

    // nums[i] == nums[j], .equals()
}
