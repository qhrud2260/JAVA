package p314;

public class KumhoTire extends Tire{
	//�ʵ�
	//������
	public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		//�޼ҵ�
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "��ȣŸ�̾� ���� : " + (maxRotation-accmulatedRotation) + "ȸ");
		return true;
		}else {
			System.out.println("***" + location + "��ȣŸ�̾� ��ũ***");
			return false;
		}
	}	
}
