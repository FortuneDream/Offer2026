package tree;

import data.TreeNode;

//验证一棵树是不是二叉搜索树
//递归判断左/右子树的节点的上下界。
//左 [下界，根节点]
//右 [根节点，上界]
public class IsValidBST {
    public boolean isValidBST(TreeNode root){
         return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root,long lower,long upper){
        if (root==null){
            return true;
        }
        if (root.val <= lower || root.val >= upper){
            return false;
        }
        return isValidBST(root.left,lower, root.val)&&isValidBST(root.right,root.val,upper);
    }
}
