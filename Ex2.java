package com.exam;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collection(frame work) : 자료구조, 저장공간
		//set : HashSet / unordered variety types storages 
		// 				 저장순서 없음 -> 중복저장 불가능
		//list: ArrayList, Vector
		//		순서있는 여러타입 저장 공간
		//		저장순서 있음 => 중복저장 가능
		//map: HashMap, Hashtable
		//				(키, 값) 쌍으로 저장
		// 				키를 이용해서 값을 얻는 자료구조.
		
		Set set=new HashSet<Object>();
		set.add("one");
		set.add(1); //auto boxing(int->Integer)
		set.add(2.5);
		set.add('t');
		System.out.println(set);
		
		set.remove(2.5);
		System.out.println(set);
		
		set.remove("one");
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println("contains: " + set.contains(1));
		
		set.clear();
		System.out.println(set.size());
		System.out.println(set);
	}

}
