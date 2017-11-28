package structurepattern.facade.facade;

import structurepattern.facade.subsystem.ModuleA;
import structurepattern.facade.subsystem.ModuleB;
import structurepattern.facade.subsystem.ModuleC;

/**
 * 门面角色类
 * 
 * 门面(Facade)角色
 * 
 * @author Administrator
 */
public class Facade {
	/**
	 * 示意方法，满足客户端需要的功能
	 */
	public void test() {
		ModuleA a = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}
}
