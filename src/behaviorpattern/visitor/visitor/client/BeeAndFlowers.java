package behaviorpattern.visitor.visitor.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;
import behaviorpattern.visitor.visitor.concretevisitor.StringVal;
import behaviorpattern.visitor.visitor.element.Flower;
import behaviorpattern.visitor.visitor.objectstructure.FlowerGenerator;
import behaviorpattern.visitor.visitor.visitor.Visitor;

/**
 * 客户测试程序
 * 
 * 在这里你能看到访问者模式执行的流程： 首先在客户端先获得一个具体的访问者角色 遍历对象结构 对每一个元素调用 accept 方法，将具体访问者角色传入
 * 这样就完成了整个过程
 * 
 * @author Administrator
 */
public class BeeAndFlowers extends TestCase {
	/**
	 * 对象结构角色在这里才组装上
	 */
	List<Flower> flowers = new ArrayList<Flower>();

	Visitor sval;

	public BeeAndFlowers() {
		for (int i = 0; i < 10; i++) {
			flowers.add(FlowerGenerator.newFlower());
		}
	}

	public void test() {
		// It's almost as if I had a function to
		// produce a Flower string representation:
		// 这个地方你可以修改以便使用另外一个具体访问者角色
		sval = new StringVal();
		Iterator<Flower> it = flowers.iterator();
		while (it.hasNext()) {
			// 第一次分派
			((Flower) it.next()).accept(sval);
			System.out.println(sval);
		}
	}

	public static void main(String args[]) {
		junit.textui.TestRunner.run(BeeAndFlowers.class);
	}
}