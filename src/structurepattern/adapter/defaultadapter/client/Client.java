package structurepattern.adapter.defaultadapter.client;

import structurepattern.adapter.defaultadapter.adapter.Adapter;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/22468457
 * http://www.blogjava.net/qixiangnj/archive/2007/01/10/92873.html?opt=admin
 * http://blog.csdn.net/fg2006/article/details/6575025
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.methodFirst();
		adapter.methodSecond();
		adapter.methodThird();
		adapter.methodFourth();
	}
}