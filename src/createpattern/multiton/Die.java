package createpattern.multiton;

import java.util.Date;
import java.util.Random;

public class Die {
	/**
	 * 创建2个实例
	 */
	private static Die die1 = new Die();

	private static Die die2 = new Die();

	/**
	 * 私有构造子
	 */
	private Die() {
	}

	/**
	 * 工厂方法
	 * 
	 * @param whichOne
	 * @return
	 */
	public static Die getInstance(int whichOne) {
		if (whichOne == 1) {
			return die1;
		}
		return die2;
	}

	/**
	 * 掷骰子
	 * 
	 * @return
	 */
	public synchronized int dice() {
		Date d = new Date();
		Random r = new Random(d.getTime());
		int value = r.nextInt();
		value = Math.abs(value) % 6 + 1;
		return value;
	}
}