package test;
/*
 * ��¥ : 2020/05/01
 * �̸� : �躸��
 * ���� : �ڹ� ������ ��������
 */
public class Q5 {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int z;
		
		z = x + y;
		System.out.println("x + y = " + z);
		
		z = x - y;
		System.out.println("x - y = " + z);
		
		z = x * y;
		System.out.println("x x y = " + z);
		
		z = x / y;
		System.out.println("x / y = " + z);
		
		z = (x + y) * (x - y);
		System.out.println("(x + y) * (x - y) = " + z);
		
		z = (x * y) + (x / y);
		System.out.println("(x * y) + (x / y) = " + z);


	}

}
