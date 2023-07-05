package esercizio2;

public class ThreadSon extends Thread {
	int[] array;
	int start;
	int end;
	int sum;

	public ThreadSon(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {

		try {
			for (int i = start; i < end; i++) {
				sum += array[i];
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getSum() {
		return sum;
	}

}
