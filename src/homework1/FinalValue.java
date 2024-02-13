package homework1;

import java.util.Scanner;

public class FinalValue {

    /*
    There is a programming language
    with only four operations and one variable X:

    ++X and X++ increments the value of the variable X by 1.
    --X and X-- decrements the value of the variable X by 1.
    Initially, the value of X is 0.

    Given an array of strings operations containing
    a list of operations, return the final value
    of X after performing all the operations.

    Example 1:

    Input: operations = ["--X","X++","X++"]
    Output: 1
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    --X: X is decremented by 1, X =  0 - 1 = -1.
    X++: X is incremented by 1, X = -1 + 1 =  0.
    X++: X is incremented by 1, X =  0 + 1 =  1.
    Example 2:

    Input: operations = ["++X","++X","X++"]
    Output: 3
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    ++X: X is incremented by 1, X = 0 + 1 = 1.
    ++X: X is incremented by 1, X = 1 + 1 = 2.
    X++: X is incremented by 1, X = 2 + 1 = 3.
    Example 3:

    Input: operations = ["X++","++X","--X","X--"]
    Output: 0
    Explanation: The operations are performed as follows:
    Initially, X = 0.
    X++: X is incremented by 1, X = 0 + 1 = 1.
    ++X: X is incremented by 1, X = 1 + 1 = 2.
    --X: X is decremented by 1, X = 2 - 1 = 1.
    X--: X is decremented by 1, X = 1 - 1 = 0.



    operations = "x++", "x--", "x++", "++x", "--x"
    x = 0;
    x++ -> x + 1 = 1;
    x-- -> x - 1 = 0;
    x++ -> x + 1 = 1;
    ++x -> 1 + x = 2;


     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Size of the array: ");
        int n = in.nextInt();

        String[] operations = new String[n];

        System.out.print("Elements: ");
        for (int i = 0; i < n; i++) {
            operations[i] = in.next();
        }

        //create performOperation() method and use operations array

        System.out.println(performOperation(operations));
    }

    //implement your performOperation() method here

    public static int performOperation(String[] operations){ // ["х--", "++x", "x--"]
        int x = 0;

        // i = 0, o[0] = x--, x -= 1, x = -1
        // i = 1, o[1] = ++x, x += 1, x = 0
        // i = 2, o[2] = x--, x -= 1, x = 1
        // return x, x = 1


        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")){
                x++;
            }
            else {
                x--;
            }
        }
        return x;
    }
}
