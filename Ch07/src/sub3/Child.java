package sub3;

public class Child extends Parent{
	
	/*
	 * �θ�Ŭ���� method1�� final �������� Override�� �� �� ����.
	public void method1() {
		System.out.println("Child -method...");
	}
	*/
	@Override
	public void method2() {
		System.out.println("Child -method...");
	}
	@Override
	public void method3(int a) {
		System.out.println("Child -method...");
	}
}
