package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		int i = -1;
		Arraylist myArrayList = new Arraylist();
		String[] tvArray = new String[10];
		File myFile = new File("./src/tvshows.txt");
		Scanner myFileScanner = new Scanner(myFile);
		while (myFileScanner.hasNextLine()) {
			String line = myFileScanner.nextLine();
			Scanner myLineScanner = new Scanner(line);
			myLineScanner.useDelimiter(",");
			while (myLineScanner.hasNextLine()) {
				String ranking = myLineScanner.next();
				String show = myLineScanner.next();
				String rating = myLineScanner.next();
				i++;
				System.out.println(i);
				if (i == myArrayList.size(tvArray)) {
					tvArray = myArrayList.expand(tvArray);
				}
				myArrayList.add(tvArray, ranking);
				i++;
				System.out.println(i);
				if (i == myArrayList.size(tvArray)) {
					tvArray = myArrayList.expand(tvArray);
				}
				myArrayList.add(tvArray, show);
				if (i == myArrayList.size(tvArray)) {
					tvArray = myArrayList.expand(tvArray);
				}
				i++;
				System.out.println(i);
				myArrayList.add(tvArray, rating);

			}
		}
		for (int x = 0; x < myArrayList.size(tvArray); x++) {
			System.out.println(myArrayList.get(tvArray, x));
		}
	}

}
