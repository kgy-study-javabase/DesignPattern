package behaviorpattern.mediator.colleague;

import behaviorpattern.mediator.mediator.IProjectManager;

/**
 * 具体同事类
 * 
 * 同事（Colleague）角色
 * 
 * @author Administrator
 */
public class YanDeveloper extends Colleague {
	public YanDeveloper(IProjectManager mediator) {
		super(mediator);
	}

	public void coding() {
		System.err.println("coding by xiao yanyan");
		getMediator().toNextColleague(this);
	}
}