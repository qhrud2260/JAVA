package sub1;

public class MethodScopeTest {
	/*
	 * 날짜 : 2020/05/06
	 * 이름 : 김보경
	 * 내용 : 자바 메서드(함수) 실행영역과 메모리 실습하기
	 */
	
	//전역변수 : 모든 메서드에서 사용가능하다.
	int result = 0;
	
	public static void main(String[] args) {
		//지역변수
		int start = 1;
		int end = 10;
		int result= 0;
		
		result = sum(start,end);
		
		
	}//main end
	
	public static int sum(int s, int e) {
		//지역변수
		
		int sum = 0;
		
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		
		return sum;
	}

}
