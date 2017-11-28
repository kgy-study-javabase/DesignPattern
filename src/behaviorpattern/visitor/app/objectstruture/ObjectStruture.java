package behaviorpattern.visitor.app.objectstruture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import behaviorpattern.visitor.app.concreteelement.ConcreteElementFirst;
import behaviorpattern.visitor.app.concreteelement.ConcreteElementSecond;
import behaviorpattern.visitor.app.element.Element;

/**
 * 结构对象
 * 
 * 对象结构角色（Object Structure）
 * 
 * @author Administrator
 */
public class ObjectStruture {
	public static List<Element> getList() {
		List<Element> list = new ArrayList<Element>();
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int a = ran.nextInt(100);
			if (a > 50) {
				list.add(new ConcreteElementFirst());
			} else {
				list.add(new ConcreteElementSecond());
			}
		}
		return list;
	}
}