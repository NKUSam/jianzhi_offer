package 斐波那契数列;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib(48));
    }

    //方法1
//    public int fib(int n) {
//        if (n == 0){
//            return 0;
//        }
//        if (n == 1){
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }

    //方法2
//    public int fib(int n) {
//        if (n<=1){
//            return n;
//        }
//        long a = 0L;
//        long b = 1L;
//        long c = 0L;
//        while (--n>0){
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        long tmp = 1000000007L;
//        return (int) (c % tmp);
//    }

    //方法3
    public int fib(int n) {
        if (n<=1){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        while (--n>0){
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
