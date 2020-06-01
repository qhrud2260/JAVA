package sub1;

import java.util.Scanner;

public class BasingIOTest {
	/*
	 * 20200521
	 * 자바기본압출력 p994
	 */
	public static void main(String[] args) {
		
		//시스템 기본 입력 스트림
		Scanner sc = new Scanner(System.in);
		
		//시스템 기본 출력 스트림
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("이름 : "+name);
	}
}
