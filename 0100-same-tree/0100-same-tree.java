
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both trees are empty
        if (p == null && q == null) {
            return true;
        }

        // Only one tree is empty
        if (p == null || q == null) {
            return false;
        }

        // Check current node and left and right subtrees
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
