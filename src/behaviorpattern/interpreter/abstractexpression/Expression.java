package behaviorpattern.interpreter.abstractexpression;

import behaviorpattern.interpreter.context.Context;

/**
 * 抽象表达式角色(Abstract Expression)，也可以用接口来实现
 * 
 * @author Administrator
 */
public abstract class Expression {
	public abstract int interpret(Context con);
}