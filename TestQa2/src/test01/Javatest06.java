package test01;
import java.util.Scanner;

public class Javatest06 {
	public static void intro() {
		System.out.println("*******START*******");
		System.out.println("�ΰ��� ������ �Է�");
	}

	public static int input(String name) {
		System.out.print("����" + name + "�� �Է� : ");

		Scanner sc = new Scanner(System.in);
		int input  = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("���� ��� : " + val);
		System.out.println("*******START*******");
	}
	
	public static int add(int x, int y){
		return x + y;
	}
	
	public static void main(String[] args)
	{
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a,b);
		result(output);
	}
}
