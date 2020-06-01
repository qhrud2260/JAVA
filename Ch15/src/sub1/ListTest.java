package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * 20200520
 * 컬렉션 프레임 워크 실습하기 교재 p.724
 */


public class ListTest {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(0, 3);
		
		for (int i = 0; i < list1.size(); i++) {
			
			System.out.printf("list1의 %d번째 원소 : %d\n" , i+1 , list1.get(i));
			
		}
		

		// 리스트 생성 및 문자열 데이터 저장
		List<String> list2 = new ArrayList<>();
		
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for(String name: list2) {
			System.out.println("name : " + name);
		}
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국",3000));
		list3.add(new Apple("미국",2500));
		list3.add(new Apple("일본",2000));
		
		//한국사과 출력
		Apple a1 = list3.get(0);
		a1.show();
				
		//미국사과 출력
		list3.get(1).show();
	}
}
