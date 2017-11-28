package behaviorpattern.mediator.colleague;

import behaviorpattern.mediator.mediator.IProjectManager;

/**
 * 抽象同事类
 * 
 * @author Administrator
 */
public abstract class Colleague {
	// 持有一个调停者对象
	private IProjectManager mediator;

	/**
	 * 构造函数
	 */
	public Colleague(IProjectManager mediator) {
		this.mediator = mediator;
	}

	/**
	 * 获取项目老大
	 */
	public IProjectManager getMediator() {
		return mediator;
	}
}