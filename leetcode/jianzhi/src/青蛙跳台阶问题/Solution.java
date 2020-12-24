package 青蛙跳台阶问题;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWays(0));
        System.out.println(solution.numWays(1));
        System.out.println(solution.numWays(2));
        System.out.println(solution.numWays(3));
        System.out.println(solution.numWays(4));
        System.out.println(solution.numWays(6));
    }

    public int numWays(int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int a = 1;
        int b = 2;
        int c = 0;
        while (--n>1){
            c = a + b;
            if (c >= 1000000007){
                c -= 1000000007;
            }
            a = b;
            b = c;
        }
        return c;
    }
}
