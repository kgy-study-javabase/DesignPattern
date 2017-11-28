package delegate.app;

public class Rocket {
	IRocketDelegate delegate = null;

	public Rocket(IRocketDelegate delegate) {
		this.delegate = delegate;
	}

	private long getRocketStartTime() {
		long startTime = delegate.startAtTime();
		return startTime;
	}

	private long getRocketEndTime() {
		long endTime = delegate.endAtTime();
		return endTime;
	}

	public boolean isOk() {
		// 超时0.1秒为失败
		if (getRocketEndTime() - getRocketStartTime() >= 100) {
			delegate.sendDidFail();
			return false;
		}
		return true;
	}
}