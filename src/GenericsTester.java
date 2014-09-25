import java.util.ArrayList;
import java.util.List;

public class GenericsTester {

	public static void main(String[] args) {

//		test1();
		
		
		

		List<Manager> managers2 = new VerifiableList<Manager>(Manager.class);
		managers2.add(new Manager("Jan", "Kowalski", 2000));
	
		// managers2.add(new Employee("Zygmunt", "Nowak", 1500));
		// java nie pozwala na dodanie nieoprawnego obiektu... czy aby napewno?

		((List) managers2).add(new Employee("Zygmunt", "Nowak", 1500));

	}

	private static void test1() {
		// przed Java 1.5
		List magagers1 = new ArrayList<>();
		magagers1.add(new Manager("Jan", "Kowalski", 2000));
		// dodalsmy zly obiekt do kolekcji
		magagers1.add(new Employee("Zygmunt", "Nowak", 1500));

		// program sie wysypie
		// java.lang.ClassCastException: Employee cannot be cast to Manager

		/*
		 * for (Object object : magagers1) {
		 * 
		 * Manager manager = (Manager) object; System.out.println(manager);
		 * 
		 * }
		 */

		// od javy 1.5

		List<Manager> managers2 = new ArrayList<Manager>();
		managers2.add(new Manager("Jan", "Kowalski", 2000));
	
		// managers2.add(new Employee("Zygmunt", "Nowak", 1500));
		// java nie pozwala na dodanie nieoprawnego obiektu... czy aby napewno?

		((List) managers2).add(new Employee("Zygmunt", "Nowak", 1500));

		for (Manager manager : managers2) {
			System.out.println(manager);
		}
	}

}
