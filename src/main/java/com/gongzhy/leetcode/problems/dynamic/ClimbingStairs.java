package com.gongzhy.leetcode.problems.dynamic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climbStairsMemo(n, memo);

    }

    int climbStairsMemo(int n, int memo[]) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            if (memo[n] > 0) {
                return memo[n];
            }
            memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
            return memo[n];
        }
    }

}
