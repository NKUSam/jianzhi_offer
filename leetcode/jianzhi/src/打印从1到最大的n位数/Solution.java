package 打印从1到最大的n位数;

public class Solution {
    //方法一：通过字符串相加得出最大值
    public int[] printNumbers1(int n) {
        String max_str = "";
        while (n-- != 0){
            max_str += "9";
        }
        int max = Integer.parseInt(max_str);
        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    //方法二：通过公式得出最大值
    public int[] printNumbers2(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] result = new int[max];
        for (int i = 0; i < max; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
