package p314;

public class KumhoTire extends Tire{
	//필드
	//생성자
	public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}
		
		//메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "금호타이어 수명 : " + (maxRotation-accmulatedRotation) + "회");
		return true;
		}else {
			System.out.println("***" + location + "금호타이어 펑크***");
			return false;
		}
	}	
}
