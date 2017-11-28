package dispatch.unidispatch.overriding;

import dispatch.common.Father;
import dispatch.common.Son;

public class Test {
	public static void main(String[] rags) {
		Father f = new Father();
		Father s = new Son();
		f.dost(1);
		f.dost("dispatchTest1");
		s.dost(4);
		s.dost("dispatchTest2");
		
		Son son = new Son();
		son.dost("test", 5);
	}
}