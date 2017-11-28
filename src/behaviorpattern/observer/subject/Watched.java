package behaviorpattern.observer.subject;

import behaviorpattern.observer.observer.Watcher;

/**
 * 抽象的被观察者，在其中声明方法（添加、移除观察者，通知观察者）
 * 
 * 抽象目标角色（Subject）
 * 
 * @author Administrator
 */
public interface Watched {
	/**
	 * 
	 * @param watcher
	 */
	public void addWatcher(Watcher watcher);

	/**
	 * 
	 * @param watcher
	 */
	public void removeWatcher(Watcher watcher);

	/**
	 * 
	 */
	public void notifyWatchers();
}