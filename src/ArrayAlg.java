
public class ArrayAlg {
	
	
	public static <T> T getMiddle(T... array) {
		return array[array.length / 2];
	}
	
	
	public static void main(String[] args) {
		String [] names = {"Tomek", "Rafal", "Radek"};
		
	   String name1 = ArrayAlg.<String> getMiddle(names);
	   
	   
	   System.out.println(name1);
	   
	   
	   String name2 = getMiddle(names);
	   
	   System.out.println(name2);

	}

}
