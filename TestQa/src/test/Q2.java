package test;

import java.util.Scanner;

/*
 * ��¥ : 2020/05/01
 * �̸� : �躸��
 * ���� : �ڹ� �⺻ ����� ��������
 */
public class Q2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input �� �Է� : ");
		
		input  = sc.nextInt();
		int result = input * 3;
		
		System.out.println("(1+2)xinput = "+result);
		
		String name;
		System.out.print("name �� �Է� : ");
		
		name = sc.next();
		String hello = "�ȳ�!"+name+"�� �ݰ����ϴ�.";
		
		System.out.println(hello);

	}
}
