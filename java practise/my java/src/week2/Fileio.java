package week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileio {
	public static void main(String args[]) {
		try {
		FileReader f=new FileReader("C:\\Users\\gandu\\Desktop\\repo notes\\"
				+ "revature_India_26th_July_13Week\\"
				+ "Week2(Java_Advanced)\\notes_images\\notes.txt");
		BufferedReader br=new BufferedReader(f);
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\gandu\\Desktop\\repo\\new"));
		int character = f.read();
		while (character != -1) {
			System.out.print((char) character);
			character = f.read();
		}
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch (IOException e) {
		e.printStackTrace();
	}

}
}