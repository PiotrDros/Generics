package bridgemethod;

public class CovariatesTest implements Cloneable {
	
	
	private Integer x;
	
	
	
	public CovariatesTest(Integer x) {
		this.x = x;
	}
	
	public Integer getX() {
		return x;
	}

	@Override
	public CovariatesTest clone()  {
		CovariatesTest clone;
		try {
			clone = (CovariatesTest) super.clone();
			clone.x = this.x;
			
			return clone;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		CovariatesTest t1 = new CovariatesTest(23);
		
		CovariatesTest t2 = t1.clone();
		
		System.out.println(t2.getX());
		
	}

}
