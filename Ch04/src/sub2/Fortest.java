package sub2;

/*날짜 : 2020/05/01 
 * 이름 : 김보경
 * 내용 : 반복문 for 실습하기
 */

public class Fortest {

	public static void main(String[] args) {
		
		//for 반복문
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("Hello Java!");
		}
		
		//1부터 10까지 합
		int sum = 0;
		
		for(int i = 1; i<11; i++)
		{
			sum = sum + i;
		} 
		
		System.out.println("1부터 10까지 합 : " + sum);
		//1부터 10까지 짝수합
		int esum = 0;
		
		for(int i = 1; i < 11; i++)
		{
			if(i%2 == 0)
			{
				esum += i;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : " + esum);
		
		//이중 for문
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("i : " + i);
			for(int j = 1; j <= 5; j++)
			{
				System.out.println("j : " + j);
			}
		}
		
		
		//구구단
		
		for(int i = 2; i <10; i++)
		{
			System.out.println("--"+i+"단--");
			for(int j = 1; j < 10; j++)
			{
				int z = i * j;
				System.out.println(i+"X"+j+"="+z );
			}
		}
		//별 삼각형 I
		for(int start = 10;start>1; start--)
		{
			for(int end = 1; end<=start; end++)
			{
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		//별 삼각형 II
		for(int a = 1; a<=5; a++)
		{
			for(int b = 1; b<=5-a; b++)
			{
				System.out.print("☆");
			}
			for(int c = 1; c<=a;c++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
	}

}
