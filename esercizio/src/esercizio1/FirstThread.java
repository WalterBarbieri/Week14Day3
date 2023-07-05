package esercizio1;

public class FirstThread extends Thread {
	private String char1;

	public FirstThread(String char1) {
		this.char1 = char1;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(char1);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.printf("Esecuzione interrotta");
			e.printStackTrace();
		}
	}

}
