package com.exam;

import java.util.ArrayList;
import java.util.List;

class Puppy {
	int age;

	Puppy(int age) {
		super();
		this.age = age;
	}

	void speak() {
		System.out.println(age + "살 강아지가 멍멍~~!!");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generic : type parameter(매개변수)
		List<Object> list = new ArrayList<Object>();

		list.add("홍길동"); // String 타입
		list.add(20); // 오토박싱 Integer 타입
		list.add(new Puppy(3)); // Puppy 타입
		list.add(new Puppy(5)); // Puppy 타입

		// 인덱스 위치 요소를 가져오기
		String str = (String) list.get(0); // Object -> String 형변환
		System.out.println(str);

//		double dNum = (Double) list.get(0);

		int num = (Integer) list.get(1); // Object -> Integer
		System.out.println(num);

		Puppy puppy = (Puppy) list.get(2);
		puppy.speak();

		System.out.println("====================");

		List<Puppy> puppyList = new ArrayList<>();

//		puppyList.add("문자열");
		puppyList.add(new Puppy(1));
		puppyList.add(new Puppy(2));
		puppyList.add(new Puppy(3));
		puppyList.add(new Puppy(4));
		puppyList.add(new Puppy(5));

		Puppy p = puppyList.get(1);
		p.speak();

		System.out.println("==================");

		for (int i = 0; i < puppyList.size(); i++) {
			Puppy pupp = puppyList.get(i);
			pupp.speak();
		}

		System.out.println("==================");

		for (Puppy pup : puppyList) {
			pup.speak();
		}

	}// main

}
