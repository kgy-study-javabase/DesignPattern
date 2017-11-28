package behaviorpattern.state.concretestate;

import behaviorpattern.state.state.State;

/**
 * State接口有一个fire()方法，我们实现两个子类NormalState和ExcitedState，分别表示普通状态和打了兴奋针后的状态，
 * 并实现具体的fire方法
 * 
 * 具体状态（Concrete State）角色
 * 
 * @author Administrator
 */
public class NormalState implements State {
	public NormalState() {
		System.out.println("机枪兵的普通状态");
	}

	@Override
	public void fire() {
		System.out.println("普通状态每秒开枪1次");
	}
}