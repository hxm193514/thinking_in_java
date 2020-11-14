package com.hxm.chapter02;

public class practice03 {
	/*
	 * 形式参数问题：
	 * String作为参数传递
	 * StringBuffer作为参数传递 
	 * 
	 * 形式参数：
	 *         基本类型：形式参数的改变不影响实际参数
	 *         引用类型：形式参数的改变直接影响实际参数
	 * 
	 * 注意：
	 *         String作为参数传递，效果和基本类型作为参数传递是一样的。
	 */
	public static void main(String[] argy) {
		String s1 = "A";
		String s2 = "B";
		swap1(s1, s2);
		System.out.println("s1 is " + s1 + "\ns2 is " + s2);
		
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		swap2(a, b);
		System.out.println("a is " + a + "\nb is " + b);
	}

	public static void swap1(String x, String y) {
		y = x;
	
	    x = y+x;
	}

	public static void swap2(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
		y.append(x);
	}
}
