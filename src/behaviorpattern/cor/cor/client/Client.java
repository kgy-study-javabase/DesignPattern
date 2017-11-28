package behaviorpattern.cor.cor.client;

import behaviorpattern.cor.cor.concretehandler.ConcreteHandler;
import behaviorpattern.cor.cor.handler.Handler;

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
		// 组装责任链
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();
		handler1.setSuccessor(handler2);
		// 提交请求
		handler1.handleRequest();
	}
}