package test;
/*
 * 날짜 : 2020/05/01
 * 이름 : 김보경
 * 내용 : 자바 조건문 연습문제
 */
public class Q7 {

	public static void main(String[] args) {
		
		boolean isOk = true;
		boolean isValid = true;
		
		if(isOk == true && isValid == true)//true && isValid 둘다 true면 이렇게만 넣어도 되나봄
		{
			System.out.println("isOk와 isValid 값은 true입니다.");
		}else {
			System.out.println("isOk와 isValid 값 중 하나는 false입니다.");
		}
			

	}

}
