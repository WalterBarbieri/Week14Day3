package esercizio2;

import java.util.Random;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Random rnd = new Random();
		int[] myArray = new int[3000];

		int provaTotale = 0;
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rnd.nextInt();
			// provaTotale += myArray[i];
		}
		for (int num : myArray) {
			provaTotale += num;

		}
		System.out.println(provaTotale);

		ThreadSon t1 = new ThreadSon(myArray, 0, 1000);
		ThreadSon t2 = new ThreadSon(myArray, 1000, 2000);
		ThreadSon t3 = new ThreadSon(myArray, 2000, 3000);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int totale = t1.getSum() + t2.getSum() + t3.getSum();
		System.out.println(totale);

	}

}
