package dispatch.unidispatch.other;

import dispatch.common.Father;
import dispatch.common.Son;

public class Test {
	// 这几个方法，唯独的不同便在这参数上
	public void dost(Father f, Father f1) {
		System.out.println("ff");
	}

	public void dost(Father f, Son s) {
		System.out.println("fs");
	}

	public void dost(Son s, Son s2) {
		System.out.println("ss");
	}

	public void dost(Son s, Father f) {
		System.out.println("sf");
	}

	public static void main(String[] rags) {
		Father f = new Father();
		Father s = new Son();
		Test t = new Test();
		t.dost(f, new Father());
		t.dost(f, s);
		t.dost(s, s);
		t.dost(s, f);
	}
}