package sub1;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG Power On...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG Power Off...");

	}

	@Override
	public void ChUp() {
		System.out.println("LG Ch Up...");

	}

	@Override
	public void ChDown() {
		System.out.println("LG Ch Down...");

	}

	@Override
	public void soundUp() {
		System.out.println("LG sound Up...");

	}

	@Override
	public void soundDown() {
		System.out.println("LG sound Down...");

	}

}
