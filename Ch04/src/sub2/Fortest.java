package sub2;

/*��¥ : 2020/05/01 
 * �̸� : �躸��
 * ���� : �ݺ��� for �ǽ��ϱ�
 */

public class Fortest {

	public static void main(String[] args) {
		
		//for �ݺ���
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("Hello Java!");
		}
		
		//1���� 10���� ��
		int sum = 0;
		
		for(int i = 1; i<11; i++)
		{
			sum = sum + i;
		} 
		
		System.out.println("1���� 10���� �� : " + sum);
		//1���� 10���� ¦����
		int esum = 0;
		
		for(int i = 1; i < 11; i++)
		{
			if(i%2 == 0)
			{
				esum += i;
			}
		}
		
		System.out.println("1���� 10���� ¦���� : " + esum);
		
		//���� for��
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("i : " + i);
			for(int j = 1; j <= 5; j++)
			{
				System.out.println("j : " + j);
			}
		}
		
		
		//������
		
		for(int i = 2; i <10; i++)
		{
			System.out.println("--"+i+"��--");
			for(int j = 1; j < 10; j++)
			{
				int z = i * j;
				System.out.println(i+"X"+j+"="+z );
			}
		}
		//�� �ﰢ�� I
		for(int start = 10;start>1; start--)
		{
			for(int end = 1; end<=start; end++)
			{
				System.out.print("��");
			}
			System.out.print("\n");
		}
		//�� �ﰢ�� II
		for(int a = 1; a<=5; a++)
		{
			for(int b = 1; b<=5-a; b++)
			{
				System.out.print("��");
			}
			for(int c = 1; c<=a;c++)
			{
				System.out.print("��");
			}
			System.out.println();
		}
		
	}

}
