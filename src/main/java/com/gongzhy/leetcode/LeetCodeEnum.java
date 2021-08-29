package com.gongzhy.leetcode;

public enum  LeetCodeEnum {
    //
    Binary_Tree_Inorder_Traversal(94, null);

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
