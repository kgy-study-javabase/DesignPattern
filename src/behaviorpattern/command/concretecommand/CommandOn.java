package behaviorpattern.command.concretecommand;

import behaviorpattern.command.command.Command;
import behaviorpattern.command.receiver.Tv;

/**
 * 开机命令ConcreteCommand
 * 
 * 具体命令角色（Concrete Command）
 * 
 * @author Administrator
 */
public class CommandOn implements Command {
	private Tv myTv;

	public CommandOn(Tv tv) {
		myTv = tv;
	}

	public void execute() {
		myTv.turnOn();
	}
}