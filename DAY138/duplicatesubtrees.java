class Solution {
    Map<String,Integer> map=new HashMap<>();
    List<TreeNode> res=new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        duplicate(root);
        return res;
    }
    public String duplicate(TreeNode root){
        if(root==null) 
        return "";
        String left= duplicate(root.left);
        String right= duplicate(root.right);
        String curr= root.val +" "+left +" "+ right;
        map.put(curr, map.getOrDefault(curr, 0)+ 1);
        if(map.get(curr) == 2)
            res.add(root);
        return curr;
    }
}