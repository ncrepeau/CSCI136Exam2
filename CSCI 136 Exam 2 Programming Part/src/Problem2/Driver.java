package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		int i = 0;
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
				//add the ranking
				i++;
				if (i >= myArrayList.size(tvArray)) {
					tvArray = myArrayList.expand(tvArray, ranking);
				}
				myArrayList.add(tvArray, ranking);
				//Add the show
				i++;
				if (i >= myArrayList.size(tvArray)) {
					tvArray = myArrayList.expand(tvArray, show);
				}
				myArrayList.add(tvArray, show);
				//add the rating 
				i++;
				if (i >= myArrayList.size(tvArray)) {
					System.out.println("In if statement 3");
					tvArray = myArrayList.expand(tvArray, rating);
				}
				myArrayList.add(tvArray, rating);

			}
		}
		for (int x = 0; x < myArrayList.size(tvArray); x++) {
			try {
			if(myArrayList.get(tvArray,x).equals("null")) {
				break;
			}else {
				System.out.println(myArrayList.get(tvArray, x));
			}
			}catch(NullPointerException ex) {
				break;
			}
			
		}
	}

}
