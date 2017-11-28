package behaviorpattern.immutable.weakclone;

import behaviorpattern.immutable.common.User;

/**
 * 弱不变模式 不变模式之clone
 * 
 * 不变模式（Immutable Pattern）
 * 
 * 参考URL：http://blog.csdn.net/weigbo/article/details/6246109
 * 
 * @author Administrator
 */
public class WeakImmutableClone {
	public static void main(String[] args) {
		User[] users = new User[3];
		users[0] = new User();
		users[0].setName("peterwei");
		users[1] = new User();
		users[1].setName("Tomssssss");
		users[2] = new User();
		users[2].setName("peterwei88");

		time4Check();
		/**
		 * 时间到，我们需要一一检查队列成员是不是vip,如果是可以去USA.假设是多线程环境,并且users数组是多线程共享,
		 * 那么另外的线程通过users去修改users[n],这时就会把users[n]绕过时间检查而去USA.
		 */
		goUSA(users);
	}

	public static void goUSA(User[] users) {
		for (User u : users) {
			if (checkVip(u)) {
				System.out.println("You can go!");
			} else {
				System.out.println("go away!");
			}
		}
	}

	public static boolean checkVip(User user) {
		if (user.getName().startsWith("peterwei")) {
			return true;
		}
		return false;
	}

	public static void time4Check() {
		// 假设时间期限到，要检查上万人以上的队列。
	}
}