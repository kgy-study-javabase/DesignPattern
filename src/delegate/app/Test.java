package delegate.app;

/**
 * 测试类
 * 
 * 委派模式（Delegate）
 * 
 * 参考URL：http://blog.csdn.net/veryitman/article/details/6937468
 * 
 * @author Administrator
 */
public class Test {
	public static void main(String args[]) {
		new ProfessionalWorker().send();
		System.out.println("*********************************************");
		new SparetimeWorker().send();
	}
}