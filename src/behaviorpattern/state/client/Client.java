package behaviorpattern.state.client;

import behaviorpattern.state.concretestate.ExcitedState;
import behaviorpattern.state.context.Marine;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/chana1101/article/details/5769857
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个机枪兵的实例
		Marine marine = new Marine();
		// 调用fire()方法
		marine.fire();
		// 设置为兴奋状态
		marine.setState(new ExcitedState());
		// 再调用fire()方法
		marine.fire();
	}
}