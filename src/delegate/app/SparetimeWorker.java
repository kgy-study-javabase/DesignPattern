package delegate.app;

public class SparetimeWorker {
	public void send() {
		boolean isOk = new Rocket(new IRocketDelegate() {
			@Override
			public long startAtTime() {
				System.out.println("startAtTime is call-back in SparetimeWorker !");
				return System.currentTimeMillis();
			}

			@Override
			public long endAtTime() {
				System.out.println("endAtTime is call-back in SparetimeWorker!");
				return System.currentTimeMillis() + 100L;
			}

			@Override
			public void sendDidFail() {
				System.out.println("SparetimeWorker send Rocket fail!");
			}
		}).isOk();

		if (isOk) {
			System.out.println("SparetimeWorker send Rocket ok!");
		}
	}
}