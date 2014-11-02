package com.answer;

import java.util.ArrayList;

/**
 * Created by chiang on 14-11-2.
 */
public class MaxDepthOfBinaryTree {
    public  static int maxDepth(TreeNode root){
        ArrayList<TreeNode> parentArray = new ArrayList<TreeNode>();
        ArrayList<TreeNode> childrenArray = new ArrayList<TreeNode>();
        int depth = 0;
        parentArray.add(root);

        if (root == null)
            return depth;

        while (!parentArray.isEmpty()){
            for (TreeNode node : parentArray) {
                if (node.left != null)
                    childrenArray.add(node.left);
                if (node.right != null)
                    childrenArray.add(node.right);
            }
            parentArray = childrenArray;
            childrenArray = new ArrayList<TreeNode>();
            depth++;
        }
        return  depth;

    }

}
