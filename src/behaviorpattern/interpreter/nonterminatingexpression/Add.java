package behaviorpattern.interpreter.nonterminatingexpression;

import behaviorpattern.interpreter.abstractexpression.Expression;
import behaviorpattern.interpreter.context.Context;

/**
 * 非终结符表达式角色(Non Terminating Expression)
 * 
 * @author Administrator
 */
public class Add extends Expression {
	private Expression left, right;

	public Add(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Context con) {
		return left.interpret(con) + right.interpret(con);
	}
}