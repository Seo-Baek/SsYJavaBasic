package com.sist;

public class Ex04 {

	public static void main(String[] args) {
		
		// 1) 숫자 + 숫자 ==> 숫자(+는 덧셈의 역할)
		System.out.println(10 + 2);		//12
		
		// 2) 문자 + 숫자 ==> 문자(+는 연결의 의미)
		System.out.println("10" + 2);	//102

		// 3) 숫자 + 문자 ==> 문자(+는 연결의 의미)
		System.out.println(10 + "2");	//102

		// 4) 문자 + 문자 ==> 문자(+는 연결의 의미)
		System.out.println("10" + "2");	//102
		
		System.out.println("a ==> " + 10 + 2);	 // a ==> 102
		System.out.println("a ==> " + (10 + 2)); // a ==> 12
		
	}

}
