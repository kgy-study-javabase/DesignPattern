package delegate.delegate;

public class ClassSecond {
	private ClassFirst first = new ClassFirst();

	public ClassSecond() {
		System.out.println("construction ClassSecond");
	}

	public void methodFirst() {
		System.out.println("ClassSecond methodFirst");
		first.methodFirst();
	}

	public void methodSecond() {
		System.out.println("ClassSecond methodSecond");
		first.methodSecond();
	}
}