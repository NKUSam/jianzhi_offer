package 替换空格;

import javax.management.StringValueExp;
import java.util.Arrays;

public class Solution {


    //方法1：使用StringBuilder
//    public String replaceSpace(String s) {
//        StringBuilder rl = new StringBuilder();
//        int tmp_index = 0;
//        int count = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            count++;
//            if (chars[i] == ' '){
//                String s1 = String.valueOf(chars, tmp_index, count - 1);
//                rl.append(s1).append("%20");
//                count = 0;
//                tmp_index = i + 1;
//            }
//            if (i == chars.length - 1){
//                String s1 = String.valueOf(chars, tmp_index, count);
//                rl.append(s1);
//            }
//        }
//        return rl.toString();
//    }

    //方法2：使用数组
    public String replaceSpace(String s) {
        char[] chars = new char[s.length()*3];
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                chars[tmp++] = '%';
                chars[tmp++] = '2';
                chars[tmp++] = '0';
            }else {
                chars[tmp++] = s.charAt(i);
            }
        }
        return new String(chars,0,tmp);
    }
}
