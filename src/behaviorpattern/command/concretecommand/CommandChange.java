package behaviorpattern.command.concretecommand;

import behaviorpattern.command.command.Command;
import behaviorpattern.command.receiver.Tv;

/**
 * 频道切换命令ConcreteCommand
 * 
 * 具体命令角色（Concrete Command）
 * 
 * @author Administrator
 */
public class CommandChange implements Command {
	private Tv myTv;

	private int channel;

	public CommandChange(Tv tv, int channel) {
		myTv = tv;
		this.channel = channel;
	}

	public void execute() {
		myTv.changeChannel(channel);
	}
}