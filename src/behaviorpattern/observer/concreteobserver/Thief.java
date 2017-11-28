package behaviorpattern.observer.concreteobserver;

import behaviorpattern.observer.observer.Watcher;

/**
 * 具体的观察者 强盗
 * 
 * 具体观察者角色（Concrete Observer）
 * 
 * @author Administrator
 */
public class Thief implements Watcher {
	@Override
	public void update() {
		System.out.println("运输车有行动，强盗准备动手");
	}
}