package behaviorpattern.interpreter.nonterminatingexpression;

import behaviorpattern.interpreter.abstractexpression.Expression;
import behaviorpattern.interpreter.context.Context;

/**
 * 非终结符表达式角色(Non Terminating Expression)
 * 
 * @author Administrator
 */
public class Division extends Expression {
	private Expression left, right;

	public Division(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Context con) {
		try {
			return left.interpret(con) / right.interpret(con);
		} catch (ArithmeticException ae) {
			System.out.println("被除数为0！");
			return -11111;
		}
	}
}