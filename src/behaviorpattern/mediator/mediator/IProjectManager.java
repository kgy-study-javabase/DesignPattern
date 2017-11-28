package behaviorpattern.mediator.mediator;

import behaviorpattern.mediator.colleague.Colleague;

/**
 * 项目老大接口
 * 
 * 抽象调停者（Mediator）角色
 * 
 * @author Administrator
 */
public interface IProjectManager {
	public void toNextColleague(Colleague c);
}