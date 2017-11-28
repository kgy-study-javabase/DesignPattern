package dispatch.unidispatch.episode;

import dispatch.common.Father;
import dispatch.common.Son;

public class Test {
	public static void main(String[] rags) {
		Father f = new Father();
		Father s = new Son();
		System.out.println("f.i " + f.i);
		System.out.println("s.i " + s.i);
		f.dost();
		s.dost();
	}
}