package esercizio1;

public class App {

	public static void main(String[] args) {
		FirstThread thread1 = new FirstThread("@");
//		FirstThread thread2 = new FirstThread("#");
		SecondThread thread2 = new SecondThread("#");

		thread1.start();
		thread2.start();

	}

}
