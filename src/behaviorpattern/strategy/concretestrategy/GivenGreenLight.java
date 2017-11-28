package behaviorpattern.strategy.concretestrategy;

import behaviorpattern.strategy.strategy.Strategy;

/**
 * 三个实现类（ConcreteStrategy）： 妙计二：求吴国太开绿灯放行
 * 
 * 具体策略(Concrete Strategy)角色
 * 
 * @author Administrator
 */
public class GivenGreenLight implements Strategy {
	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯，放行");
	}
}