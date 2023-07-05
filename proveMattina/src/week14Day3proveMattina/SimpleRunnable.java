package week14Day3proveMattina;

public class SimpleRunnable implements Runnable {
	private String color;

	public SimpleRunnable(String color) {
		this.color = color;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(color + Thread.currentThread().getName() + " --> " + i);
		}

	}

}
