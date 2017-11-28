package behaviorpattern.interpreter.terminatorexpression;

import behaviorpattern.interpreter.abstractexpression.Expression;
import behaviorpattern.interpreter.context.Context;

/**
 * 终结符表达式角色(Terminator Expression)
 * 
 * @author Administrator
 */
public class Variable extends Expression {
	@Override
	public int interpret(Context con) {
		// this 为调用interpret 方法的Variable 对象
		return con.LookupValue(this);
	}
}