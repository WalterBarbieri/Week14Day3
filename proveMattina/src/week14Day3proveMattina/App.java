package week14Day3proveMattina;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SimpleThread t1 = new SimpleThread(Colors.ANSI_CYAN);
		SimpleThread t2 = new SimpleThread(Colors.ANSI_RED);

		t1.setName("My First Thread");
		t2.setName("My Second Thread");

		t1.start();
		t2.start();

		SimpleRunnable r1 = new SimpleRunnable(Colors.ANSI_BLUE);
		SimpleRunnable r2 = new SimpleRunnable(Colors.ANSI_GREEN);

		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);

		t3.setName("My Third Thread");
		t4.setName("My Fourth Thread");
		t3.start();
		t4.start();
	}

}
