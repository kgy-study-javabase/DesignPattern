package behaviorpattern.observer.client;

import behaviorpattern.observer.concreteobserver.Police;
import behaviorpattern.observer.concreteobserver.Security;
import behaviorpattern.observer.concreteobserver.Thief;
import behaviorpattern.observer.concretesubject.Transporter;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45055233
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Transporter transporter = new Transporter();

		Police police = new Police();
		Security security = new Security();
		Thief thief = new Thief();

		transporter.addWatcher(police);
		transporter.addWatcher(security);
		transporter.addWatcher(thief);

		transporter.notifyWatchers();
	}
}