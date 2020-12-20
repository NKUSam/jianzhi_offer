package 数组中重复的数字;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }

    //方法一：暴力法
//    public Integer findRepeatNumber(int[] nums) {
//        for (int i=0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[i]==nums[j]){
//                    return nums[i];
//                }
//            }
//        }
//        return null;
//    }

    //方法二：哈希表
//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set = new HashSet<Integer>();
//        for (int num : nums) {
//            if (set.contains(num)) {
//                return num;
//            }
//            set.add(num);
//        }
//
//        return -1;
//    }

    //方法三：数组
//    public int findRepeatNumber(int[] nums) {
//        int[] bucket = new int[nums.length];
//        Arrays.fill(bucket,-1);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (bucket[nums[i]] != -1){
//                return nums[i];
//            }
//            bucket[nums[i]] = i;
//        }
//
//        return -1;
//    }

    //方法四：排序
    public static int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]){
                if (nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }
}