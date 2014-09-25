import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMin {

	public static <T extends Comparable> T getMin(List<T> list) {
		Iterator<T> i = list.iterator();
		T candidate = i.next();

		while (i.hasNext()) {
			T next = i.next();
			if (next.compareTo(candidate) < 0)
				candidate = next;
		}
		return candidate;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(new Integer[] { 1, 2, -3, 6 }));

		Integer min = getMin(list);

		System.out.println(min);
	}

}
