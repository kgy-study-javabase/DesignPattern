package structurepattern.facade.client;

import structurepattern.facade.facade.Facade;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22775311
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.test();
	}
}