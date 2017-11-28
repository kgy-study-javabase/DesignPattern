package structurepattern.composite.component.client;

import structurepattern.composite.component.composite.Composite;
import structurepattern.composite.component.leaf.Leaf;

/**
 * 测试类 参考URL：http://blog.csdn.net/jason0539/article/details/22642281
 * 
 * @author Administrator
 */
public class ComponentDemo {
	public static void main(String[] args) {
		// 构造根节点
		Composite rootComposite = new Composite();
		rootComposite.name = "根节点";

		// 左节点
		Composite compositeLeft = new Composite();
		compositeLeft.name = "左节点";

		// 构建右节点，添加两个叶子几点，也就是子部件
		Composite compositeRight = new Composite();
		compositeRight.name = "右节点";
		Leaf leaf1 = new Leaf();
		leaf1.name = "右-子节点1";
		Leaf leaf2 = new Leaf();
		leaf2.name = "右-子节点2";
		compositeRight.add(leaf1);
		compositeRight.add(leaf2);

		// 左右节点加入 根节点
		rootComposite.add(compositeRight);
		rootComposite.add(compositeLeft);
		// 遍历组合部件
		rootComposite.eachChild();
	}
}