package createpattern.multiton;

/**
 * 掷骰子
 * 
 * 多例模式(Multiton)
 * 
 * 参考URL：http://blog.csdn.net/zl3450341/article/details/6878932
 * 
 * @author Administrator
 */
public class Client {
	private static Die die1, die2;

	public static void main(String[] args) throws InterruptedException {
		die1 = Die.getInstance(4);
		die2 = Die.getInstance(5);
		System.out.println(die1.dice());
		Thread.sleep(2000);
		System.out.println(die2.dice());
	}
}