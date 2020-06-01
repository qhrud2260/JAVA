package sub2;

import java.util.Set;
import java.util.TreeSet;

/*
 * 20200520
 * TreeSet p752
 */
public class TreeSetTest {
	public static void main(String[] args) {
		//Treeset 생성 및 숫자 데이터 저장
		Set<Integer> tree = new TreeSet<>();
		
		tree.add(23);
		tree.add(18);
		tree.add(48);
		tree.add(15);
		tree.add(7);
		tree.add(22);
		tree.add(56);
		
		for(int num:tree) {
			System.out.println(num + ", ");
		}
	}
}
