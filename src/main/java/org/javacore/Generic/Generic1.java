package org.javacore.Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic1 {
	
	List<? extends Number> foo1=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
	}
	
	public void fun1(){
		  ArrayList<String> files=new ArrayList<>();
		  //add方法的时候也只直接添加字符串
		  files.add("aaa");
		  String a=files.get(0);//声明泛型  编译器自动转换成泛型定义的类型
		}
	
}


