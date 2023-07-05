package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class App {
	private static File file = new File("info.txt");

	public static void main(String[] args) {

		try {
			saveOnDisk("NuovaRiga");
			System.out.println("File Salvato");
			System.out.println("Contenuto del file: ");
			System.out.println(readFromDisk());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void saveOnDisk(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo + System.lineSeparator(), "UTF-8", true);
	}

	public static String readFromDisk() throws IOException {
		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;
		} else {
			System.out.println("File non trovato");
			return "";
		}
	}
}
