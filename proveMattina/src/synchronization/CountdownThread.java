package synchronization;

public class CountdownThread extends Thread {

	public Countdown c;

	public CountdownThread(Countdown c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.doCountdown();
	}

}
