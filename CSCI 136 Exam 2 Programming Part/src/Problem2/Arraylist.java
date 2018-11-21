package Problem2;

public class Arraylist {
	private int i = 0;

	public void add(String[] tvArray, String add) {
		tvArray[i] = add;
		i++;
	}

	public int size(String[] tvArray) {
		int sizeOfArray = tvArray.length;
		return sizeOfArray;
	}

	public String[] expand(String[] tvArray) {
		String[] tvArray2 = new String[tvArray.length * 2];
		tvArray2 = tvArray;
		return tvArray2;
	}
	public String get(String[] tvArray, int arrayIndex) {
		String value = tvArray[arrayIndex];
		return value;
	}
}
