package behaviorpattern.interpreter.terminatorexpression;

import behaviorpattern.interpreter.abstractexpression.Expression;
import behaviorpattern.interpreter.context.Context;

/**
 * 终结符表达式角色(Terminator Expression)
 * 
 * @author Administrator
 */
public class Constant extends Expression {
	private int i;

	public Constant(int i) {
		this.i = i;
	}

	@Override
	public int interpret(Context con) {
		return i;
	}
}