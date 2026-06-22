package tree;

import data.TreeNode;

//是否是同一颗树
//递归判断
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null) { //递归重点
            return true;
        } else if (p == null || q == null) { //形状不同
            return false;
        } else if (p.val !=q.val) { //值不同
            return false;
        }else {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}
