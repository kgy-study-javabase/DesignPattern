package structurepattern.composite.component.composite;

import java.util.ArrayList;
import java.util.List;

import structurepattern.composite.component.component.Component;

/**
 * 组合类
 * 
 * 树枝构件角色(Composite)
 * 
 * @author Administrator
 */
public class Composite extends Component {
	/**
	 * 用来保存节点的子节点
	 */
	List<Component> list = new ArrayList<Component>();

	/**
	 * 添加节点 添加部件
	 * 
	 * @param c Component
	 */
	@Override
	public void add(Component c) {
		list.add(c);
	}

	/**
	 * 删除节点 删除部件
	 * 
	 * @param c Component
	 */
	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	/**
	 * 遍历子节点
	 */
	@Override
	public void eachChild() {
		System.out.println(name + "执行了");
		for (Component c : list) {
			c.eachChild();
		}
	}
}