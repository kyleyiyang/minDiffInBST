/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        traversal(root,lst);
        int min=lst.get(1)-lst.get(0);
        for (int i=1;i<lst.size()-1;i++) {
            if ((lst.get(i+1)-lst.get(i))<min) {
                min = (lst.get(i+1)-lst.get(i));
            }
        }
        return min;
    }
    public void traversal(TreeNode node, ArrayList<Integer> lst) {
        if (node!=null) {
            traversal(node.left,lst);
            lst.add(node.val);
            traversal(node.right,lst);
            
        }
    }
}
