package sub3;
import java.util.Map;
import java.util.HashMap;

/*
 * 20200520
 * Map p740
 */
public class MapTest {
	
	public static void main(String[] args) {
		//맵 생성 및 문자열 데이터 저장
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101,  "김유신");
		map1.put(102,  "김춘추");
		map1.put(103,  "장보고");
		map1.put(104,  "강감찬");
		map1.put(105,  "이순신");
		
		System.out.println("map1 데이터 갯수 : " + map1.size());
		
		//맵 원소 출력
		String value = map1.get(102);
		System.out.println("map1의 102번 키 값  : " + value);
		
		//앱 생성 및 사과 데이터 저장
		 Apple a1 = new Apple("한국", 3000);
		 Apple a2 = new Apple("미국", 3000);
		 Apple a3 = new Apple("일본", 3000);
		
		Map<Integer, Apple> map2 = new HashMap<>();
		
		//한국사과출력
		Apple korApple = map2.get(101);
		korApple.show();
		//미국사과출력
		map2.get(102).show();
	}
}
