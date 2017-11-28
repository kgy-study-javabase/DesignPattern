package createpattern.singleton.hungryman;

public class Singleton {
	/**
	 * 在自己内部定义自己一个实例 注意这是private 只供内部调用
	 */
	private static Singleton instance = new Singleton();

	/**
	 * 如上面所述，将构造函数设置为私有
	 */
	private Singleton() {
		System.out.println("hungryman Singleton");
	}

	/**
	 * 静态工厂方法，提供了一个供外部访问得到对象的静态方法
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		Singleton.getInstance();
	}
}