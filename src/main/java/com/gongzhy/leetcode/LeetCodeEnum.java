package com.gongzhy.leetcode;

import com.gongzhy.leetcode.problems.binarytree.BinaryTreeInorderTraversal;
import com.gongzhy.leetcode.problems.dynamic.ClimbingStairs;
import com.gongzhy.leetcode.problems.dynamic.GenerateParentheses;

public enum  LeetCodeEnum {
    // 22. 括号生成
    Generate_Parentheses(22, GenerateParentheses.class),
    // 70. 爬楼梯
    climbing_stairs(70, ClimbingStairs.class),
    //
    Binary_Tree_Inorder_Traversal(94, BinaryTreeInorderTraversal.class);

    private int index;

    private Class algorithmClazz;

    LeetCodeEnum(int index, Class algorithmClazz){
        this.index = index;
        this.algorithmClazz = algorithmClazz;
    }

    public int getIndex() {
        return index;
    }

    public Class getAlgorithmClazz() {
        return algorithmClazz;
    }
}
