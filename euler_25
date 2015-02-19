package com.projecteuler.first;

/**
 * 找到第一个数位为1000位的Fibonacci数
 */

import java.math.BigDecimal;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(1000);
	}

	public static void method(int num) {
		BigDecimal startNum = BigDecimal.ONE;
		BigDecimal endNum = BigDecimal.ONE;
		int result = 2;
		while (endNum.toString().length() < num) {
			result++;
			BigDecimal temp = endNum;
			endNum = endNum.add(startNum);
			startNum = temp;
		}
		System.out.println("The result is " + result);
	}

}
