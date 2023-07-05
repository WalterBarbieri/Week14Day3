package esercizio3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	private List<Presenza> presenze;
	private List<Presenza> readPresenze;

	public RegistroPresenze() {
		this.presenze = new ArrayList<>();
		this.readPresenze = new ArrayList<>();
	}

	public void addPresenza(String nome, int giorni) {
		Presenza presenza = new Presenza(nome, giorni);
		presenze.add(presenza);
	}

	public void writeOnFile(File myFile) {
		String presenzaString = "";
		for (Presenza presenza : presenze) {
			presenzaString += presenza.getName() + "@" + presenza.getGiorni() + "#";
		}
		try {
			FileUtils.writeStringToFile(myFile, presenzaString + System.lineSeparator(), "UTF-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile(File myFile) {
		try {
			String content = FileUtils.readFileToString(myFile, "UTF-8");
			String[] presenzeString = content.split("#");
			for (String presenzaString : presenzeString) {
				String[] partialPresenzeString = presenzaString.split("@");

				if (partialPresenzeString.length == 2) {
					String nome = partialPresenzeString[0];
					int giorni = Integer.parseInt(partialPresenzeString[1]);

					Presenza presenza = new Presenza(nome, giorni);
					readPresenze.add(presenza);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printMyFile() {
		for (Presenza presenza : readPresenze) {
			System.out.println("Nome: " + presenza.getName() + ", Giorni: " + presenza.getGiorni());
		}
	}

}
