package behaviorpattern.mediator.colleague;

import behaviorpattern.mediator.mediator.IProjectManager;

/**
 * 具体同事类
 * 
 * 同事（Colleague）角色
 * 
 * @author Administrator
 */
public class Designer extends Colleague {
	public Designer(IProjectManager mediator) {
		super(mediator);
	}

	public void disignerImage() {
		System.err.println("draw a circle...");
		getMediator().toNextColleague(this);
	}
}