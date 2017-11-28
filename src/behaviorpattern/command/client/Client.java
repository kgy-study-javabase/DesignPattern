package behaviorpattern.command.client;

import behaviorpattern.command.concretecommand.CommandChange;
import behaviorpattern.command.concretecommand.CommandOff;
import behaviorpattern.command.concretecommand.CommandOn;
import behaviorpattern.command.invoker.Control;
import behaviorpattern.command.receiver.Tv;

/**
 * 客户端角色类
 * 
 * 客户角色（Client）
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45110355
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		// 命令接收者Receiver
		Tv myTv = new Tv();
		// 开机命令ConcreteCommond
		CommandOn on = new CommandOn(myTv);
		// 关机命令ConcreteCommond
		CommandOff off = new CommandOff(myTv);
		// 频道切换命令ConcreteCommond
		CommandChange channel = new CommandChange(myTv, 2);
		// 命令控制对象Invoker
		Control control = new Control(on, off, channel);

		// 开机
		control.turnOn();
		// 切换频道
		control.changeChannel();
		// 关机
		control.turnOff();
	}
}