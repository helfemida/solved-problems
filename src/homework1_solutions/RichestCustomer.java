package homework1_solutions;

public class RichestCustomer {
    /*
    https://leetcode.com/problems/richest-customer-wealth/
     */
    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j: accounts[i]){
                current+=j;
            }
            if(current > max){
                max = current;
            }
            current = 0;
        }
        return max;
    }

}
