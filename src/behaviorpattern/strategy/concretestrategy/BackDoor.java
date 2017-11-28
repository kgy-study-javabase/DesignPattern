package behaviorpattern.strategy.concretestrategy;

import behaviorpattern.strategy.strategy.Strategy;

/**
 * 三个实现类（ConcreteStrategy）： 妙计一：初到吴国
 * 
 * 具体策略(Concrete Strategy)角色
 * 
 * @author Administrator
 */
public class BackDoor implements Strategy {
	@Override
	public void operate() {
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
	}
}