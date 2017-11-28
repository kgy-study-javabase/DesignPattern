package structurepattern.proxy.realtheme;

import structurepattern.proxy.abstracttheme.BuyCar;

/**
 * 真实主题角色(Real Theme)
 * 
 * 新建一个People人类，具有买车的行为，所以实现接口BuyCar
 * 
 * @author Administrator
 */
public class People implements BuyCar {
	private int cash;

	private String vip;

	private String username;

	@Override
	public void buyMyCar() {
		System.out.print(username + "是vip客户，可以直接购买新车！");
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}
}