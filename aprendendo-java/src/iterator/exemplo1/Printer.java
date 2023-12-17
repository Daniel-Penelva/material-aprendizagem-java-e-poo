package iterator.exemplo1;

import java.util.Iterator;

public class Printer {

	static void printAll(Iterator<?> it) {
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
