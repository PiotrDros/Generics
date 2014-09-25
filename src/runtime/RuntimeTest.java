package runtime;

import bridgemethod.Holder;

public class RuntimeTest {

	public static void main(String[] args) {

		Holder<String> h1 = new Holder<String>();

		Holder<Integer> h2 = new Holder<Integer>();

		// nie zadziala
		// System.out.println(h1 instanceof Holder<String>);

		// mozna tylkoko spawdzic czy h1 nalezy do typu golego
		System.out.println(h1 instanceof Holder<?>);
		
		
		
		// nie da sie przypisac
		// h1 = h2;
		// ale

		System.out.println(h1.getClass() == h2.getClass());

	}

}
