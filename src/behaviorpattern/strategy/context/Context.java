package behaviorpattern.strategy.context;

import behaviorpattern.strategy.strategy.Strategy;

/**
 * 环境类（Context)
 * 
 * 算法使用环境(Context)角色
 * 
 * @author Administrator
 */
public class Context {
	private Strategy strategy;

	/**
	 * 构造函数，要你使用哪个妙计
	 * 
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}