package sub3;
/*
 * ��¥ : 2020/05/13
 * �̸� : �躸��
 * ���� : �������̽� �ǽ��ϱ�
 */

public class InterfaceTest3 {
	public static void main(String[] args) {
		//�������̽� ���� : ��ü���� ���յ��� ���ߴ� ����
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.swichOn();
		socket.swichOff();
	}
}
