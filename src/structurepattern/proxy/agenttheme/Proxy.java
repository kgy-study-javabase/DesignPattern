package structurepattern.proxy.agenttheme;

import structurepattern.proxy.abstracttheme.BuyCar;
import structurepattern.proxy.realtheme.People;

/**
 * 代理主题角色(Agent Theme)
 * 
 * People类不能拥有车，必须经过Proxy代理类的认证，符合条件之后才可以拥有车辆，新建一个代理，这个代理类来考察当前的People是否有资格进行买车：
 * 
 * @author Administrator
 */
public class Proxy implements BuyCar {
	private People people;

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	@Override
	public void buyMyCar() {
		if (people.getVip() == "vip") {
			people.buyMyCar();
			return;
		}

		if (people.getCash() >= 50000) {
			System.out.println(people.getUsername() + "买了新车，交易结束！");
		} else {
			System.out.println(people.getUsername() + "钱不够，不能买车，继续比赛！");
		}
	}
}