package esercizio3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	private List<Presenza> presenze;

	public RegistroPresenze() {
		this.presenze = new ArrayList<>();
	}

	public void addPresenza(String nome, int giorni) {
		Presenza presenza = new Presenza(nome, giorni);
		presenze.add(presenza);
	}

	public void writeOnFile(String myFile) {
		String presenzaString = "";
		for (Presenza presenza : presenze) {
			presenzaString += presenza.getName() + "@" + presenza.getGiorni() + "#";
		}
		try {
			FileUtils.writeStringToFile(new File(myFile), presenzaString, "UTF-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile(String myFile) {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
