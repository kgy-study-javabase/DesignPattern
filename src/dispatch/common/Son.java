package dispatch.common;

public class Son extends Father {
	public int i = 9;

	public void dost(int i) {
		System.out.println("Welcome Son! int = " + i);
	}

	public void dost(String s, int i) {
		System.out.println("Welcome Son! String = " + s + " int = " + i);
	}

	public void dost() {
		System.out.println("Welcome Son!");
	}

	public void dosh(Father f) {
		if (f instanceof Son) {
			System.out.println("Here is Son's Son");
		} else if (f instanceof Father) {
			System.out.println("Here is Son's Father");
		}
	}
}