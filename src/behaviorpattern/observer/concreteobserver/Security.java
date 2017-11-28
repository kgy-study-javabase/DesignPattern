package behaviorpattern.observer.concreteobserver;

import behaviorpattern.observer.observer.Watcher;

/**
 * 具体的观察者 保镖
 * 
 * 具体观察者角色（Concrete Observer）
 * 
 * @author Administrator
 */
public class Security implements Watcher {
	@Override
	public void update() {
		System.out.println("运输车有行动，保安贴身保护");
	}
}