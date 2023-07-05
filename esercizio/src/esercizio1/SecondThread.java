package esercizio1;

public class SecondThread extends Thread {
	private String char2;

	public SecondThread(String char2) {
		this.char2 = char2;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(char2);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.printf("Esecuzione interrotta");
			e.printStackTrace();
		}
	}

}
