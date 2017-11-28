package behaviorpattern.immutable.weak;

import behaviorpattern.immutable.common.User;

/**
 * 弱不变模式
 * 
 * 不变模式（Immutable Pattern）
 * 
 * 参考URL：http://blog.csdn.net/weigbo/article/details/6246109
 * 
 * @author Administrator
 */
public class WeakImmutable {
	// 属性私有，满足条件2
	private int state;

	// 属性私有，满足条件2
	private User user;

	private Integer age;

	public WeakImmutable(int state, User user, Integer age) {
		this.state = state;
		this.user = user;
		this.age = age;
	}

	public int getState() {
		return this.state;
	}

	public User getUser() {
		return this.user;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setState() {
		// 对象没有任何方法修改对象的状态,满足条件1 do nothing.
	}

	public static void main(String[] args) {
		int state = 0;
		User u = new User();
		Integer age = 100;
		u.setName("yes");
		WeakImmutable weak = new WeakImmutable(state, u, age);
		System.out.println("原始值：" + weak.getState() + "," + weak.getUser().getName() + "," + weak.getAge());
		// 修改引用后
		state = 5;
		// User由于是可变对象引用，所以有影响
		u.setName("no");
		age = 200;
		System.out.println("修改引用后：" + weak.getState() + "," + weak.getUser().getName() + "," + weak.getAge());
	}
}