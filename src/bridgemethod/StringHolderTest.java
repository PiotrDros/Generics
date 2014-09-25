package bridgemethod;

public class StringHolderTest {

	public static void main(String[] args) {

		StringHolder s1 = new StringHolder();
		s1.setT("Hello1");

		System.out.println(s1.getT());

		// i jak do tej pory wszystko bylo w porzadku...

		Holder<String> s2 = new StringHolder();
		s2.setT("Hello2");

		System.out.println(s2.getT());

		// goly typ
		Holder s3 = s2;
		// s3 jest golym typem, metoda setT przyjmuje object, mimo wszystko
		// wywoalywana jest "poliorficznie" metoda setT(String) z StringHolder
		s3.setT("Hello3");
		// s3.setT(new Object());

		System.out.println(s3.getT());
	}

}
