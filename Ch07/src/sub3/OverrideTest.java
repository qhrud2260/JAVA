package sub3;

/*
 * ��¥ : 2020/05/12
 * �̸� : �躸��
 * ���� : �������̵� �޼��� �ǽ��ϱ� ���� p.295
 */

public class OverrideTest {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		//final
		//final ���� : ���
		//final �޼��� : �������̵� ����
		//final Ŭ���� : ��ӱ���
		final int NUM = 1; 
		final double PI = 3.14;
		//NUM = 2;��� : �빮�ڷ� ǥ���ؾ���, ó�� �ʱ�ȭ�� ������ �����ȴ�.
		
	}
}
