package 二维数组中的查找;

public class Solution {
    public static void main(String[] args) {
//        int[][] arr = new int[10][20];
//        System.out.println(arr.length);//获取的是10
        int[][] arr2 = {{-5}};
        System.out.println(findNumberIn2DArray(arr2, -10));
    }

    //方法1：暴力法
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                if (anInt == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    //方法2：二分查找1边
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if (matrix.length != 0){
//            int length = matrix[0].length;
//            for (int i = 0; i < matrix.length; i++) {
//                int left = 0;
//                int right = length;
//                int mid = 0;
//                for (int j = 0; j < length; j++){
//                    mid = (left+right) / 2;
//                    if (matrix[i][mid] < target){
//                        left = mid;
//                    }
//                    if (matrix[i][mid] > target){
//                        right = mid;
//                    }
//                    if (matrix[i][mid] == target){
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }

    //方法3：二分查找法2两边
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        int length_col = matrix.length;
//        if (length_col != 0){
//            int length_row = matrix[0].length;
//            int min = Math.min(length_col,length_row);
//            for (int i = 0; i < min; i++) {
//                int left = i;
//                int right = length_row;
//                int mid_row = 0;
//
//                for (int j = length_row; j>0 ; j /= 2){
//                    mid_row = (left+right) / 2;
//                    if (matrix[i][mid_row] < target){
//                        left = mid_row;
//                    }
//                    if (matrix[i][mid_row] > target){
//                        right = mid_row;
//                    }
//                    if (matrix[i][mid_row] == target){
//                        return true;
//                    }
//                }
//
//                int height = i;
//                int low = length_col;
//                int mid_col = 0;
//                for (int k = length_col; k > 0; k /=2){
//                    mid_col = (height+low) / 2;
//
//                    if (matrix[mid_col][i] < target){
//                        height = mid_col;
//                    }
//                    if (matrix[mid_col][i] > target){
//                        low = mid_col;
//                    }
//                    if (matrix[mid_col][i] == target){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    //方法1：线性查找
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows != 0){
            int cols = matrix[0].length;
            int i = rows - 1;
            int j = 0;

            while (i >= 0 && j < cols){
                if (matrix[i][j] == target){
                    return true;
                }else if (matrix[i][j] > target){
                    i--;
                }else{
                    j++;
                }
            }
        }
        return false;
    }
}