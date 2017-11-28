package structurepattern.composite.component.component;

/**
 * 抽象构件角色(Component)
 * 
 * @author Administrator
 */
public abstract class Component {
	public String name;

	public abstract void add(Component c);

	public abstract void remove(Component c);

	public abstract void eachChild();
}