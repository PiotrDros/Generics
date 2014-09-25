package bridgemethod;


public class StringHolder extends Holder<String> {

	@Override
	public String getT() {
		return t;
	}

	@Override
	public void setT(String t) {
		System.out.println("Wywoalano setT(String) z StringHolder z argumentem: " + t);
		this.t = t;
	}
	

}
