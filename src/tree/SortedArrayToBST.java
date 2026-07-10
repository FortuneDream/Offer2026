package tree;

import data.TreeNode;

//有序数组转成二叉平衡树
// 取中点mid作为根节点，左/右节点递归返回分别为（left，mid-1）和(mid+1,right)
//背诵即可
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length-1);
    }

    public TreeNode sort(int[] nums , int left ,int right){
        if (left > right){
            return null;
        }
        int mid = (right+left)/2;
        TreeNode node =new TreeNode(nums[mid]);
        node.left=sort(nums,left,mid-1);
        node.right = sort(nums,mid+1,right);
        return node;
    }
}
