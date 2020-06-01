package sub2;

public class MultiGenericTest {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		SmartPhone phone = new SmartPhone();
		
		Product<Tv, Integer> p1 = new Product<>(tv, 3000);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		
		p1.show();
		p2.show();
	}
}
