package com.gongzhy.leetcode.problems.dynamic;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fibonacci-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FibonacciNumber {

    @Test
    public void test() {
        System.out.println(memorandum(31));
        System.out.println(dp(31));
    }


    public int fib(int n) {
        //
        return dp(n);
    }


    /**
     * 解法一：备忘录（自上而下）
     *
     * @param n
     * @return
     */
    private Map<Integer, Integer> map;

    private int memorandum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        map = new HashMap();
        map.put(0, 0);
        map.put(1, 1);
        //
        return memorandumHandle(n);
    }

    /**
     * @param n
     * @return
     */
    private int memorandumHandle(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = memorandumHandle(n - 1) + memorandumHandle(n - 2);
        map.put(n, result);
        return result;
    }

    /**
     * 解法二：DP 自下而上
     *
     * @param n
     * @return
     */
    private int dp(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fir = 0;
        int sec = 1;
        //
        for (int i = 2; i <= n; i++) {
            int sum = fir + sec;
            fir = sec;
            sec = sum;
        }
        return sec;
    }

}
