package behaviorpattern.interpreter.context;

import java.util.HashMap;
import java.util.Map;

import behaviorpattern.interpreter.terminatorexpression.Variable;

/**
 * 上下文（环境）角色(context)，使用HashMap 来存储变量对应的数值
 * 
 * @author Administrator
 */
public class Context {
	private Map<Variable, Integer> valueMap = new HashMap<Variable, Integer>();

	public void addValue(Variable x, int y) {
		Integer yi = new Integer(y);
		valueMap.put(x, yi);
	}

	public int LookupValue(Variable x) {
		int i = ((Integer) valueMap.get(x)).intValue();
		return i;
	}
}