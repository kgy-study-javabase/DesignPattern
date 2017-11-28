package behaviorpattern.command.invoker;

import behaviorpattern.command.command.Command;

/**
 * 可以看作是遥控器Invoker
 * 
 * 请求者角色（Invoker）
 * 
 * @author Administrator
 */
public class Control {
	private Command onCommand, offCommand, changeChannel;

	public Control(Command on, Command off, Command channel) {
		onCommand = on;
		offCommand = off;
		changeChannel = channel;
	}

	public void turnOn() {
		onCommand.execute();
	}

	public void turnOff() {
		offCommand.execute();
	}

	public void changeChannel() {
		changeChannel.execute();
	}
}