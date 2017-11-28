package createpattern.singleton.lazyman;

public class Singleton {
	/**
	 * 和上面有什么不同？
	 */
	private static Singleton instance = null;

	/**
	 * 设置为私有的构造函数
	 */
	private Singleton() {
		System.out.println("lazyman Singleton");
	}

	/**
	 * 静态工厂方法
	 * 
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		// 这个方法比上面有所改进
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton.getInstance();
	}
}