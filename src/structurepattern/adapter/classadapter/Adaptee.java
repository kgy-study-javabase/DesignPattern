package structurepattern.adapter.classadapter;

import structurepattern.adapter.common.ConcreteTarget;
import structurepattern.adapter.common.Target;

/**
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * 
 * 参考URL： http://blog.csdn.net/jason0539/article/details/22468457
 * 
 * @author Administrator
 */
public class Adaptee {
	public void specificRequest() {
		System.out.println("被适配类具有 特殊功能...");
	}

	/**
	 * 测试类public class Client
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.request();
	}
}