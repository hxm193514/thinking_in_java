package com.hxm.chapter01;

import java.util.Scanner;

public class text {

	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            String str = scanner.next();
	            if (str.length() != 5){
	                System.out.println("你输入数字的长度不等于5！");
	            }
	            else{
	                char[] mzz = str.toCharArray();
	                for (char s: mzz){
	                    if (s != '1'){
	                        System.out.println("请输入正规数字 1");
	                        return;
	                    }
	                }
	                System.out.println("发送端:"+str);
	                str+=0;
	                int y = Integer.parseInt(str);
	                System.out.println("接收端:"+y);
	            }
	        } catch (Exception e) {
	            System.out.println(new Exception("请输入数字"));
	        }
	    }
		 

}
