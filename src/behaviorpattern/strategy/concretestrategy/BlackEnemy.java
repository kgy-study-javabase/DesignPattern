package behaviorpattern.strategy.concretestrategy;

import behaviorpattern.strategy.strategy.Strategy;

/**
 * 三个实现类（ConcreteStrategy）： 妙计三：孙夫人断后，挡住追兵
 * 
 * 具体策略(Concrete Strategy)角色
 * 
 * @author Administrator
 */
public class BlackEnemy implements Strategy {
	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}
}