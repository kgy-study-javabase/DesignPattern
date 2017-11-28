package behaviorpattern.memento.client;

import behaviorpattern.memento.originator.Originator;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/yangyan1990/article/details/5830765
 * http://blog.csdn.net/yangyan1990/article/category/722835
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Originator o = new Originator();
		o.createMemento();
		o.modifyState4Test(80);
		o.setMemento();
	}
}