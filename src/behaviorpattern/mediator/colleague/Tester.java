package behaviorpattern.mediator.colleague;

import behaviorpattern.mediator.mediator.IProjectManager;

/**
 * 具体同事类
 * 
 * 同事（Colleague）角色
 * 
 * @author Administrator
 */
public class Tester extends Colleague {
	public Tester(IProjectManager mediator) {
		super(mediator);
	}

	public void test() {
		System.err.println("test case...");
		getMediator().toNextColleague(this);
	}
}