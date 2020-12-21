package 从尾到头打印链表;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(Arrays.toString(reversePrint(listNode1)));
    }

    //方法1：暴力法
//    public static int[] reversePrint(ListNode head) {
//        if (head != null){
//            //获取数组大小
//            ListNode temp_node = head;
//            int num = 1;
//            while (temp_node.next != null){
//                temp_node = temp_node.next;
//                num++;
//            }
//            int[] tmp_result = new int[num];
//
//
//            //将单向链表的元素顺序的赋值给数组
//            int tmp = 0;
//            tmp_result[tmp++] = head.val;
//            while (head.next != null){
//                head = head.next;
//                tmp_result[tmp++] = head.val;
//            }
//
//
//            //对数组进行反转
//            int[] result = new int[tmp];
//            for (int i = 0;i < tmp_result.length;i++){
//                result[i] = tmp_result[--tmp];
//            }
//
//
//            return result;
//        }
//        return new int[0];
//    }


    //方法2：栈
//    public static int[] reversePrint(ListNode head) {
//        Stack<Integer> stack = new Stack<Integer>();
//        //赋值栈
//        while (head != null){
//            stack.push(head.val);
//            if (head.next == null){
//                head = null;
//            }else {
//                head = head.next;
//            }
//        }
//
//        //创建对应大小的数组
//        int size = stack.size();
//        int[] result = new int[size];
//        int tmp = 0;
//        while (size > 0){
//            result[tmp++] = stack.pop();
//            size--;
//        }
//        return result;
//    }

    //方法3
//    public static int[] reversePrint(ListNode head) {
//        if (head != null){
//            //创建队列并将链表的值插入到队列中
//            Queue<Integer> queue = new LinkedList<>();
//            queue.add(head.val);
//            while (head.next != null){
//                head = head.next;
//                queue.add(head.val);
//            }
//
//            //创建要返回的数组
//            int size = queue.size();
//            int[] result = new int[size];
//
//            //对返回数组赋值
//            for (int i = size - 1; i >= 0; i--) {
//                result[i] = queue.remove();
//            }
//            return result;
//        }
//        return new int[0];
//    }

    //方法4
    public static int[] reversePrint(ListNode head) {
        if (head != null){
            ListNode tmp_node = head;
            int num = 1;
            while (tmp_node.next != null){
                tmp_node = tmp_node.next;
                num++;
            }
            ListNode new_head = reverse(head);
            new_head.next = null;
            int[] result = new int[num];
            int index = 0;
            while (tmp_node.next != null){
                result[index++] = tmp_node.val;
                tmp_node = tmp_node.next;
            }
            result[index] = tmp_node.val;
            return result;
        }
        return new int[0];
    }

    private static ListNode reverse(ListNode listNode){
        if (listNode.next == null){
            return listNode;
        }

        ListNode tmp = reverse(listNode.next);
        tmp.next = listNode;
        return listNode;
    }
}
class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}