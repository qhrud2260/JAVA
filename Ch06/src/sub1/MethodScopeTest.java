package sub1;

public class MethodScopeTest {
	/*
	 * ��¥ : 2020/05/06
	 * �̸� : �躸��
	 * ���� : �ڹ� �޼���(�Լ�) ���࿵���� �޸� �ǽ��ϱ�
	 */
	
	//�������� : ��� �޼��忡�� ��밡���ϴ�.
	int result = 0;
	
	public static void main(String[] args) {
		//��������
		int start = 1;
		int end = 10;
		int result= 0;
		
		result = sum(start,end);
		
		
	}//main end
	
	public static int sum(int s, int e) {
		//��������
		
		int sum = 0;
		
		for(int k = s; k <= e; k++) {
			sum += k;
		}
		
		return sum;
	}

}
