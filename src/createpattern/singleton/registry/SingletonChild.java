package createpattern.singleton.registry;

public class SingletonChild extends Singleton {
	public SingletonChild() {
		System.out.println("registry child Singleton");
	}

	static public SingletonChild getInstance() {
		return (SingletonChild) Singleton.getInstance("SingletonChild");
	}
	
	public static void main(String[] args) {
		Singleton.getInstance("singleton.registry.SingletonChild");
	}
}