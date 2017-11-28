package dispatch.unidispatch.overLoading;

/**
 * Test For OverLoading
 * 
 * @author Administrator
 */
public class Test {
	public void doSomething(int i) {
		System.out.println("doString int = " + i);
	}

	public void doSomething(String s) {
		System.out.println("doString String = " + s);
	}

	public void doSomething(int i, String s) {
		System.out.println("doString int = " + i + " String = " + s);
	}

	public static void main(String[] rags) {
		Test t = new Test();
		t.doSomething(0);
		t.doSomething("1");
		t.doSomething(2, "2");
	}
}