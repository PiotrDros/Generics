import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMinRaw {

	public static Comparable getMin(List<Comparable> list) {
		Iterator<Comparable> i = list.iterator();
		Comparable candidate = i.next();

		while (i.hasNext()) {
			Comparable next = i.next();
			if (next.compareTo(candidate) < 0)
				candidate = next;
		}
		return candidate;
	}


}
