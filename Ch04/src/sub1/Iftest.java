package sub1;

import java.util.Scanner;

/*��¥ : 2020/05/01 
 * �̸� : �躸��
 * ���� :���ǹ� if �ǽ��ϱ�
 */

public class Iftest {
	
	public static void main(String[] args) {
	
		//if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2)
		{
			System.out.println("num1�� num2���� �۴�.");
		}
		
		if(num1 > 0)
		{
			if(num2> 1) 
			{
				System.out.println("num1�� 0���� ũ�� num2�� 1���� �۴�.");
			}
		}
		
		if(num1 > 0 && num2>1)
		{
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��.");
		}
		
		//if ~ else
		if(num1>num2)
		{
			System.out.println("num1�� num2���� ũ��.");
		}else
		{
			System.out.println("num1�� num2���� �۴�.");
		}
		
		//if ~ else if ~ else
		int n1=1, n2=2, n3=3, n4=4;
		if(n1 > n2)
		{
			System.out.println("n1�� n2���� ũ��.");
		}else if(n2 > n3)
		{
			System.out.println("n2�� n3���� ũ��.");
		}
		else if(n3 > n4)
		{
			System.out.println("n3�� n4���� ũ��.");
		}
		else
		{
			System.out.println("n4�� ���� ũ��.");
		}
		
	
	
	//��������
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�����Է� : ");
	int score = sc.nextInt();

	System.out.println("�Է��Ͻ� ������" + score + "�Դϴ�.");
	 
	if(90<=score&&score<=100)
	{
		System.out.println("����� A�Դϴ�.");
	}else if(80<=score&&score<=89)
	{
		System.out.println("����� B�Դϴ�.");
	}
	else if(70<=score&&score<=79)
	{
		System.out.println("����� C�Դϴ�.");
	}
	else if(60<=score&&score<=69)
	{
		System.out.println("����� D�Դϴ�.");
	}else
	{
		System.out.println("����� E�Դϴ�.");
	}
	}
}
