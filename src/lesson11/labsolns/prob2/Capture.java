package lesson11.labsolns.prob2;

import java.util.*;

public class Capture {
	public static void reverse(List<?> items) {
		
		reverseHelper(items);
	}

	private static <T> void reverseHelper(List<T> list) {
		List<T> tmp = new ArrayList<T>(list);
		for (int i = 0; i < list.size(); i++) {
			list.set(i, tmp.get(list.size() - i - 1));

		}
		
	}
}