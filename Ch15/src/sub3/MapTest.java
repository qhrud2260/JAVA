package sub3;
import java.util.Map;
import java.util.HashMap;

/*
 * 20200520
 * Map p740
 */
public class MapTest {
	
	public static void main(String[] args) {
		//�� ���� �� ���ڿ� ������ ����
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101,  "������");
		map1.put(102,  "������");
		map1.put(103,  "�庸��");
		map1.put(104,  "������");
		map1.put(105,  "�̼���");
		
		System.out.println("map1 ������ ���� : " + map1.size());
		
		//�� ���� ���
		String value = map1.get(102);
		System.out.println("map1�� 102�� Ű ��  : " + value);
		
		//�� ���� �� ��� ������ ����
		 Apple a1 = new Apple("�ѱ�", 3000);
		 Apple a2 = new Apple("�̱�", 3000);
		 Apple a3 = new Apple("�Ϻ�", 3000);
		
		Map<Integer, Apple> map2 = new HashMap<>();
		
		//�ѱ�������
		Apple korApple = map2.get(101);
		korApple.show();
		//�̱�������
		map2.get(102).show();
	}
}
