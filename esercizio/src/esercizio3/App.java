package esercizio3;

import java.io.File;

public class App {
	private static File myFile = new File("info.txt");

	public static void main(String[] args) {
		RegistroPresenze regPres = new RegistroPresenze();

		regPres.addPresenza("Salta Lacorda", 11);
		regPres.addPresenza("Mario Rossi", 7);
		regPres.addPresenza("Piazzalabomba Escappa", 19);

		regPres.writeOnFile(myFile);
		regPres.readFromFile(myFile);
		regPres.printMyFile();

	}

}
