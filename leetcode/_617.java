package leetcode;

/**
 * Created by xyq on 2017/9/12.
 */
public class _617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return null;
        TreeNode node = new TreeNode((t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val));
        node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return node;
    }
}
