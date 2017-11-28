package behaviorpattern.cor.app.client;

import behaviorpattern.cor.app.concretehandler.DeptManager;
import behaviorpattern.cor.app.concretehandler.GeneralManager;
import behaviorpattern.cor.app.concretehandler.ProjectManager;
import behaviorpattern.cor.app.handler.Handler;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45091639
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		// 先要组装责任链
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// 开始测试
		String test1 = h3.handleFeeRequest("张三", 300);
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest("李四", 300);
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest("张三", 700);
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest("李四", 700);
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest("张三", 1500);
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest("李四", 1500);
		System.out.println("test6 = " + test6);
	}
}