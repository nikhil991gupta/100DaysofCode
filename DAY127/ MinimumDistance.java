class Solution {
    int min=Integer.MAX_VALUE,diff=0;
    public int minDiffInBST(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        dfs(root,list);//to traverse through

        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++)
        {
            diff=Math.abs(list.get(i)-list.get(i+1));
           min= Math.min(min,diff);

        }
        return min;


        
    }
    private void dfs(TreeNode root,List<Integer> list)
    {
        if(root == null)
        {
            return;
            
        }
        list.add(root.val);
        dfs(root.left,list);
         dfs(root.right,list);


    }
}