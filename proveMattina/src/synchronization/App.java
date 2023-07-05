package synchronization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		Countdown c = new Countdown();
		CountdownThread t1 = new CountdownThread(c);
		CountdownThread t2 = new CountdownThread(c);

		t1.start();
		t2.start();

		// usando il metodo join non riusciamo ad ottenere il risultato per problemi di
		// accesso alle risorse, bisonga ricorrere al lock tramite synchronized
	}

}
