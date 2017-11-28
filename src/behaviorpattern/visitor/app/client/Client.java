package behaviorpattern.visitor.app.client;

import java.util.List;

import behaviorpattern.visitor.app.concretevisitor.Visitor;
import behaviorpattern.visitor.app.element.Element;
import behaviorpattern.visitor.app.objectstruture.ObjectStruture;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45146271
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		List<Element> list = ObjectStruture.getList();
		for (Element e : list) {
			e.accept(new Visitor());
		}
	}
}