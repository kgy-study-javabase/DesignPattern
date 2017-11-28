package structurepattern.composite.app.component;

/**
 * 抽象构件角色(Component)
 * 
 * @author Administrator
 */
public abstract class Market {
	public String name;

	public abstract void add(Market c);

	public abstract void remove(Market c);

	public abstract void payByCard();
}