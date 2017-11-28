package behaviorpattern.observer.concreteobserver;

import behaviorpattern.observer.observer.Watcher;

/**
 * 具体的观察者 警察
 * 
 * 具体观察者角色（Concrete Observer）
 * 
 * @author Administrator
 */
public class Police implements Watcher {
	@Override
	public void update() {
		System.out.println("运输车有行动，警察护航");
	}
}