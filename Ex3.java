package com.exam;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list interface 구현 -> Arraylist, Vector
		//: 가변크기 배열
		List list = new ArrayList();
		
		System.out.println(list.size()); //요소 개수 : 0
		
		
		list.add(1); //index 0번째
		list.add("둘"); //index 1
		list.add(3.14); //index 2
		list.add(1,'사'); // index 1 위치에 '사' 삽입
		
		System.out.println(list);//list.toString()
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.contains(3.14));
		
		list.clear();
		System.out.println(list.size()); //요소 개수 0
		System.out.println(list);
		System.out.println(list.isEmpty()); //true
		
	}//main

}
