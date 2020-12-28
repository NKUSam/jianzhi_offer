package 旋转数组的最小数字;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int[] arr1 = {3,4,5,1,2};
        Solution solution = new Solution();
        System.out.println(solution.minArray(arr1));
    }
    //方法2：暴力法
//    public int minArray(int[] numbers) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            if (numbers[i]>numbers[i+1]){
//                return numbers[i+1];
//            }
//        }
//        return numbers[0];
//    }

    //方法2：二分法
    public int minArray(int[] numbers) {
        int pre = 0;
        int post = numbers.length - 1;
        int mid = 0;
        while (pre < post){
            mid = (pre + post) / 2;
            if (numbers[mid] < numbers[post]){
                post = mid;
            }else if (numbers[mid] > numbers[post]){
                pre = mid + 1;
            }else {
                post --;
            }
        }
        return numbers[pre];
    }
}
