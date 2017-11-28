package createpattern.prototype.deepclone;

public class Professor implements Cloneable {
	String name;

	int age;

	Professor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		return o;
	}
}