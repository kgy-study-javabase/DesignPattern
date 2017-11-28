package createpattern.multiton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.alibaba.fastjson.JSONObject;

/**
 * 多例模式(Multiton)
 * 
 * 参考URL：http://blog.csdn.net/jiujie395/article/details/8537892
 * 
 * @author Administrator
 */
public class Dice {
	private static final Dice dice1 = new Dice();

	private static final Dice dice2 = new Dice();

	// 用于放多个实例的list
	private static List<Dice> list = new ArrayList<Dice>();

	// 最多的实例数
	private static final int maxCount = 2;

	static {
		list.add(dice1);
		list.add(dice2);
	}

	/**
	 * 私有构造方法,避免外部创建实例
	 */
	private Dice() {
	}

	/**
	 * @description: 随机拿取实例
	 */
	public static Dice getInstance() {
		Random random = new Random();
		int current = random.nextInt(maxCount);
		return list.get(current);
	}

	/**
	 * @description: 指定拿取某一个实例
	 */
	public static Dice getInstance(int index) {
		return list.get(index);
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Dice dice1 = Dice.getInstance(0);
		Dice dice2 = Dice.getInstance(1);
		System.out.println("dice1.list==" + JSONObject.toJSONString(dice1.list));
		System.out.println("dice1.dice1.list==" + JSONObject.toJSONString(dice1.dice1.list));
		System.out.println("dice1.dice2.list==" + JSONObject.toJSONString(dice1.dice2.list));
		System.out.println("dice2.list==" + JSONObject.toJSONString(dice2.list));
		System.out.println("dice1.dice1.list==" + JSONObject.toJSONString(dice1.dice1.list));
		System.out.println("dice2.dice2.list==" + JSONObject.toJSONString(dice2.dice2.list));
	}
}