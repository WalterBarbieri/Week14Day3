package week14Day3proveMattina;

public class SimpleThread extends Thread {
	private String color;

	public SimpleThread(String color) {
		this.color = color;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(color + Thread.currentThread().getName() + " --> " + i);
		}
	}

}
