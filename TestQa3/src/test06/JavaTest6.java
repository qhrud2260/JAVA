  package test06;



	class Rent{
		public void payment() {
			System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
		}
	}
	
	class Landload extends Rent{
		public void getMoney() {
			System.out.println("�ǹ����Դϴ�.");
			payment();
		}
	}
	
	
public class JavaTest6 {	
	public static void main(String[] args) {

		Landload master = new Landload();
		master.getMoney();

	}

}
