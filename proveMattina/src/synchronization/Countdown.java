package synchronization;

public class Countdown {
	private int i;

	public void doCountdown() {
		synchronized (this) {
			for (i = 10; i > 0; i--) {
				App.log.info("i = " + i);
			}
		}
	}
}
