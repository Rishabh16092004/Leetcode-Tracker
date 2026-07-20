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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int lev = 0;
        int sum =Integer.MIN_VALUE;
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int currsum = 0;
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                currsum += curr.val;
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            lev++;
            if(currsum>sum){
                ans = lev;
                sum = currsum;
            }
        }
        return ans;
    }
}