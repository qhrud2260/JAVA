package sub1;

public class ObjectTest {

	public static void main(String[] args) {
		Object a1 = new Apple("�ѱ�",3000);
		Object a2 = new Apple("�ѱ�",3000);
		Object b1 = new Banana("�븸",2500);
		Object b2 = new Banana("�߱�",1500);
		
		//���⼺�� Ȱ��Ǵ� Object Ŭ����
		Object fruit[] = {a1,a2,b1,b2};
	}

}
