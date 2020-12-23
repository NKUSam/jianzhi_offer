package 两个栈实现队列;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        if (stack1.empty()){
            //如果栈1是空栈，直接对其进行压栈
            stack1.add(value);
        }else {
            if (stack2.empty()){
                //如果栈1非空和栈2为空，则说明伪队列中只有一个元素。可以直接对栈2进行压栈
                stack2.add(value);
            }else {
                //当伪队列中有大于等于2个元素时进行如下操作
                //如果栈2里有元素，将它的全部元素都要如栈到栈1里
                while (!stack2.isEmpty()){
                    stack1.add(stack2.pop());
                }

                //对栈2进行压栈
                stack2.add(value);

                //将栈1中除了栈底的元素全部移到栈2
                while (!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
                stack1.add(stack2.pop());
            }
        }

    }

    public int deleteHead() {
        if (!stack1.isEmpty()){
            //如果栈1非空，则将栈顶元素取出来
            int tmp = stack1.pop();
            //如果栈2非空，则将其栈顶元素压栈到栈1中
            if (!stack2.isEmpty()){
                stack1.add(stack2.pop());
            }
            return tmp;
        }
        return -1;
    }

    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(3);
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}
