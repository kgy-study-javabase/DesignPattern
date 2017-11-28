package dispatch.multidispatch;

import dispatch.common.Father;
import dispatch.common.Son;

public class Test {
	public static void main(String[] rags) {
		Father f = new Father();
		Father s = new Son();
		s.dosh(f);
		s.dosh(s);
		f.dosh(s);
		f.dosh(f);
	}
}