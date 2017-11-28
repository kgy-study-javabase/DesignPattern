package structurepattern.composite.component.leaf;

import structurepattern.composite.component.component.Component;

/**
 * 组合部件类
 * 
 * 树叶构件角色(Leaf)
 * 
 * @author Administrator
 */
public class Leaf extends Component {
	/**
	 * 叶子节点不具备添加的能力，所以不实现
	 * 
	 * @param c Component
	 */
	@Override
	public void add(Component c) {
		System.out.println("");
	}

	/**
	 * 叶子节点不具备添加的能力必然也不能删除
	 * 
	 * @param c Component
	 */
	@Override
	public void remove(Component c) {
		System.out.println("");
	}

	/**
	 * 叶子节点没有子节点所以显示自己的执行结果
	 */
	@Override
	public void eachChild() {
		System.out.println(name + "执行了");
	}
}