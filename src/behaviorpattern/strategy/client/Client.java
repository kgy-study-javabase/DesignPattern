package behaviorpattern.strategy.client;

import behaviorpattern.strategy.concretestrategy.BackDoor;
import behaviorpattern.strategy.concretestrategy.BlackEnemy;
import behaviorpattern.strategy.concretestrategy.GivenGreenLight;
import behaviorpattern.strategy.context.Context;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45007553
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("刚到吴国使用第一个锦囊");
		Context context = new Context(new BackDoor());
		context.operate();

		System.out.println("刘备乐不思蜀使用第二个锦囊");
		context.setStrategy(new GivenGreenLight());
		context.operate();

		System.out.println("孙权的追兵来了，使用第三个锦囊");
		context.setStrategy(new BlackEnemy());
		context.operate();
	}
}