package delegate.delegate;

/**
 * 测试类
 * 
 * 委派模式（Delegate）
 * 
 * 参考URL：http://blog.csdn.net/ergouge/article/details/7421256
 * 
 * @author Administrator
 */
public class Test {
	public static void main(String args[]) {
		ClassSecond second = new ClassSecond();
		// invoke methodFirst of class ClassFirst in fact
		second.methodFirst();
		// invoke methodSecond of class ClassFirst in fact
		second.methodSecond();
	}
}