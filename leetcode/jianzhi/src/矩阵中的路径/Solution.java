package 矩阵中的路径;

public class Solution {
    //暴力法
    public boolean exist(char[][] board, String word) {
        boolean flag = true;
        int left_x = 0;
        int right_x = 0;
        int top_y = 0;
        int bottom_y = 0;
        int x = 0;
        int y = 0;
        char[] chars = word.toCharArray();
        //确定第一个元素位置
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (chars[0] == board[i][j]){
                    x = i;
                    y = j;
                }
            }
        }
        //连接确定
        for (int i = 1; i < chars.length; i++) {
            left_x = y - 1;
            right_x = y + 1;
            top_y = x - 1;
            bottom_y = x + 1;
            if (chars[i] == board[x][left_x]){
                y --;
            }
            if (chars[i] == board[x][right_x]){
                y ++;
            }
            if (chars[i] == board[top_y][y]){
                x --;
            }
            if (chars[i] == board[bottom_y][y]){
                x ++;
            }
        }
        return flag;
    }
}
