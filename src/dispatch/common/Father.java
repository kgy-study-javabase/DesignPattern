package dispatch.common;

public class Father {
	public int i = 0;

	public void dost(int i) {
		System.out.println("Welcome Father! int = " + i);
	}

	public void dost(String s) {
		System.out.println("Welcome Father! String = " + s);
	}

	public void dost() {
		System.out.println("Welcome Father!");
	}

	public void dosh(Father f) {
		if (f instanceof Son) {
			System.out.println("Here is Father's Son");
		} else if (f instanceof Father) {
			System.out.println("Here is Father's Father");
		}
	}
}