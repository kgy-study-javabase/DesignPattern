package delegate.app;

public class ProfessionalWorker implements IRocketDelegate {
	@Override
	public long startAtTime() {
		System.out.println("startAtTime is call-back inProfessionalWorker!");
		return System.currentTimeMillis();
	}

	@Override
	public long endAtTime() {
		System.out.println("endAtTime is call-back in ProfessionalWorker!");
		return System.currentTimeMillis();
	}

	@Override
	public void sendDidFail() {
		System.out.println("ProfessionalWorker send Rocket fail!");
	}

	public void send() {
		if (new Rocket(this).isOk()) {
			System.out.println("ProfessionalWorker send Rocket ok!");
		}
	}
}