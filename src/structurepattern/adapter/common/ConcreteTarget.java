package structurepattern.adapter.common;

/**
 * 具体目标类，只提供普通功能
 * 
 * @author Administrator
 */
public class ConcreteTarget implements Target {
	@Override
	public void request() {
		System.out.println("普通类 具有 普通功能...");
	}
}