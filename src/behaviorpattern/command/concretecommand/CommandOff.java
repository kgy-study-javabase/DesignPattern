package behaviorpattern.command.concretecommand;

import behaviorpattern.command.command.Command;
import behaviorpattern.command.receiver.Tv;

/**
 * 关机命令ConcreteCommand
 * 
 * 具体命令角色（Concrete Command）
 * 
 * @author Administrator
 */
public class CommandOff implements Command {
	private Tv myTv;

	public CommandOff(Tv tv) {
		myTv = tv;
	}

	public void execute() {
		myTv.turnOff();
	}
}