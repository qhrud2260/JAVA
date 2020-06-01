package test;
/*
 * 날짜 : 2020/05/01
 * 이름 : 김보경
 * 내용 : 자바 별피라미드 연습문제
 */
public class Q9_1 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");		
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");		
			}
			
			System.out.print("\n");		
		}
		
		int m = 0;
		
		for (int i = 4; i > m; i--) {
			
			for (int j = m+5; j > i; j--) {
				System.out.print(" ");		
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");		
			}
			
			System.out.print("\n");		
		}


	}

}
