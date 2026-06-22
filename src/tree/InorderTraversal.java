package tree;


import data.TreeNode;

import java.util.ArrayList;
import java.util.List;

//中序遍历
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result =new ArrayList<>();
        traversal(result,root);
        return result;
    }

    public void traversal(List<Integer> result ,TreeNode root){
        if (root==null){
            return ;
        }

        traversal(result,root.left);
        result.add(root.val); //这个放在哪就是哪种遍历。
        traversal(result,root.right);
    }


}
