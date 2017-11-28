package behaviorpattern.interpreter.client;

import behaviorpattern.interpreter.abstractexpression.Expression;
import behaviorpattern.interpreter.context.Context;
import behaviorpattern.interpreter.nonterminatingexpression.Add;
import behaviorpattern.interpreter.nonterminatingexpression.Division;
import behaviorpattern.interpreter.nonterminatingexpression.Multiply;
import behaviorpattern.interpreter.nonterminatingexpression.Subtract;
import behaviorpattern.interpreter.terminatorexpression.Constant;
import behaviorpattern.interpreter.terminatorexpression.Variable;

/**
 * 客户端角色类
 * 
 * 测试程序，计算 (a*b)/(a-b+2)
 * 
 * 参考URL：http://blog.csdn.net/ylchou/article/details/7594135
 * http://blog.csdn.net/ylchou/article/category/1116567
 * 
 * @author Administrator
 */
public class Test {
	private static Context con;

	public static void main(String[] args) {
		con = new Context();
		// 设置变量、常量
		Variable a = new Variable();
		Variable b = new Variable();
		Constant c = new Constant(2);
		// 为变量赋值
		con.addValue(a, 5);
		con.addValue(b, 7);
		// 运算，对句子的结构由我们自己来分析，构造
		Expression ex1 = new Multiply(a, b);
		Expression ex2 = new Add(new Subtract(a, b), c);
		Expression ex3 = new Division(new Multiply(a, b), new Add(new Subtract(a, b), c));
		System.out.println("运算结果为：" + ex1.interpret(con));
		System.out.println("运算结果为：" + ex2.interpret(con));
		System.out.println("运算结果为：" + ex3.interpret(con));
	}
}