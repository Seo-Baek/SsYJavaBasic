package com.sist;

// 패키지 : 동일한 클래스들의 모임(폴더와 유사)
//		   패키지는 소문자로 작성하는 것이 관례

/*
 * java 프로그램 특징
 * 1. 객체지향 언어이다.
 * 2. 클래스 단위로 프로그램을 작성한다.
 * 3. 한 문장은 세미콜론으로 끝난다.
 * 4. 클래스의 이름은 대문자로 시작하고,
 * 	    메소드는 소문자 형태로 작성한다.
 * 5. main() : 프로그램의 시작 위치를 의미한다.
 */

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요?? 자바에 오신 걸 환영합니다.");
		System.out.println("안녕하세요!!");
		System.out.print("방가방가~~~");
		System.out.print("반갑습니다.");
		System.out.println();
		System.out.println(); // 빈 줄 하나 삽입
		System.out.println("저는 백서진입니다.");
		
		/*
		 * - System.out : 표준 출력 장치(모니터, 콘솔)
		 * - println()  : 지정된 장치에 결과를 출력하는 메소드
		 * 				ln ㅡ> line (출력 후 줄바꿈) 
		 * - print()	  : 다음 줄로 이동하지 않고 옆(오른쪽)에 출력하는 메소드
		 * - 한 문장이 끝나면 맨 끝에 세미콜론(;)을 붙여주어야 한다.
		 * 
		 * - 자바 프로그램은 JVM(자바 가상기계)이 제일 먼저 main() 메소드를 찾아서
		 * 	 main() 메소드 안에 있는 문장을 위에서 아래로 차례대로 실행을 한다.
		 * - println()의 괄호를 비워두면 빈 상태로 줄을 뗀다.
		 * 
		 * - 클래스를 만들 경우에 클래스 이름은 대문자로 시작한다.
		 * 
		 * - 이클립스 기본 단축키
		 * 	 ctrl + F11				  ==>  save + run
		 * 	 syso + ctrl + space bar  ==> 출력문 자동 완성
		 * 	 main + ctrl + space bar  ==> main() 메소드 생성
		 * 	 ctrl + s				  ==> 저장 단축키
		 * 
		 */
	}
}
