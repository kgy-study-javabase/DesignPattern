package behaviorpattern.state.state;


/**
 * 首先定义抽象状态State接口，这个接口指定了机枪兵的fire行为
 * 
 * 状态（State）角色
 * 
 * @author Administrator
 */
public interface State {
	public void fire();
}