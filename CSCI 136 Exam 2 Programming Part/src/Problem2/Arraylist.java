package Problem2;

import java.util.Arrays;


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

	public static <T> T[] expand(T[] tvArray, T element) {
		T[] result = Arrays.copyOf(tvArray, tvArray.length * 2);
		result[tvArray.length] = element;
		return result;
	}
	public String get(String[] tvArray, int arrayIndex) {
		String value = tvArray[arrayIndex];
		return value;
	}
}
