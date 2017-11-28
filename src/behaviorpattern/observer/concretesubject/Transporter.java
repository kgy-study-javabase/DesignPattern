package behaviorpattern.observer.concretesubject;

import java.util.ArrayList;
import java.util.List;

import behaviorpattern.observer.observer.Watcher;
import behaviorpattern.observer.subject.Watched;

/**
 * 具体的被观察者
 * 
 * 具体目标角色（Concrete Subject）
 * 
 * @author Administrator
 */
public class Transporter implements Watched {
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers() {
		for (Watcher watcher : list) {
			watcher.update();
		}
	}
}