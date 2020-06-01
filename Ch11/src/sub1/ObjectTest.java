package sub1;

public class ObjectTest {

	public static void main(String[] args) {
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("한국",3000);
		Object b1 = new Banana("대만",2500);
		Object b2 = new Banana("중국",1500);
		
		//다향성에 활용되는 Object 클래스
		Object fruit[] = {a1,a2,b1,b2};
	}

}
