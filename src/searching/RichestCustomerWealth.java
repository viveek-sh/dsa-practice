/*
https://leetcode.com/problems/richest-customer-wealth/description/
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10. */
package searching;

public class RichestCustomerWealth {
    static void main() {
        int[][] acc = {{1,5},{7,3},{3,5}};
        int max = 0;
        for (int i = 0; i < acc.length; i++) {
            int balance = 0;
            for (int j = 0; j < acc[i].length; j++) {
                balance += acc[i][j];
            }
            if(max < balance){
                max = balance;
            }
        }
        System.out.println(max);

    }
}
