package 二进制中1的个数;

public class Solution {
    public static void main(String[] args) {
        int i = hammingWeight2(11);
        System.out.println(i);
    }

    //方法1：使用Integer.toBinaryString()方法
    static int hammingWeight1(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int num = 0;
        for (char aChar : chars) {
            if (aChar == '1') {
                num++;
            }
        }
        return num;
    }

    //方法2：转换为二进制
    static int hammingWeight2(int n) {
        int sum = 0;
        int i;
        while (n != 0){
            i = n & 1;
            if (i == 1){
                sum ++;
            }
            n >>>= 1;
        }
        return sum;
    }
}
