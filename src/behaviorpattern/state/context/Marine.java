package behaviorpattern.state.context;

import behaviorpattern.state.concretestate.NormalState;
import behaviorpattern.state.state.State;

/**
 * 最后，定义机枪兵类Marine，每个Marine的实例代表一个机枪兵
 * 
 * 使用环境（Context）角色
 * 
 * @author Administrator
 */
public class Marine {
	/**
	 * 保持一个状态类的实例
	 */
	private State state = new NormalState();

	/**
	 * 为机枪兵设置状态
	 * 
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * fire()方法，实际调用的是state变量的fire()方法
	 */
	public void fire() {
		state.fire();
	}
}