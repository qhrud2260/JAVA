package sub1;

/*
 * ��¥ : 2020/05/13
 * �̸� : �躸��
 * ���� : �������̽� �ǽ��ϱ�
 */

public class InterfaceTest1 {
	public static void main(String[] args) {
		//�������̽� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.ChDown();
		lg.soundUp();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.ChUp();
		samsung.soundUp();
	}
}
