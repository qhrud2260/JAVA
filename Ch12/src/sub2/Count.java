package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public synchronized void setNum() {
		num++;
		//오직 하나만 메서드 출력..?
	}
	
}
