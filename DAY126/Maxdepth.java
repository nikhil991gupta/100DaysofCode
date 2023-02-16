package DAY126;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
       int leftr=maxDepth(root.left);
        int rightr=maxDepth(root.right);
        return Math.max(leftr,rightr)+1;
        


    }
}