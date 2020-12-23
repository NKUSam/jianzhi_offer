package 重建二叉树;

public class Solution {
    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        Solution solution = new Solution();
        System.out.println(solution.buildTree(pre, in));
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,0, preorder.length - 1,inorder,0,inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder,int pre_start,int pre_end,int[] inorder,int in_start,int in_end){
//        if (in_end < in_start){
//            return null;
//        }
        if (pre_start > pre_end){
            return null;
        }

        //确定根节点
        TreeNode root = new TreeNode(preorder[pre_start]);

        //遍历后序数组查找根节点位置
        int index_root = 0;
        int temp = pre_start;
        pre_start++;
        for (int i = in_start; i <= in_end; i++) {
            if (inorder[i] == root.val){
                index_root = i;
                break;
            }
            temp++;
        }

        //递归遍历
        root.left = buildTreeHelper(preorder, pre_start, temp, inorder, in_start, index_root - 1);
        root.right = buildTreeHelper(preorder,temp+1, pre_end, inorder, index_root + 1, in_end);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}