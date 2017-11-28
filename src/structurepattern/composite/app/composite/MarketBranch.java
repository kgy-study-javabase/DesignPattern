package structurepattern.composite.app.composite;

import java.util.ArrayList;
import java.util.List;

import structurepattern.composite.app.component.Market;

/**
 * 组合类
 * 
 * 树枝构件角色(Composite)
 * 
 * 分店 下面可以有加盟店
 * 
 * @author Administrator
 */
public class MarketBranch extends Market {
	/**
	 * 加盟店列表
	 */
	List<Market> list = new ArrayList<Market>();

	public MarketBranch(String s) {
		this.name = s;
	}

	@Override
	public void add(Market m) {
		list.add(m);
	}

	@Override
	public void remove(Market m) {
		list.remove(m);
	}

	/**
	 * 消费之后，该分店下的加盟店自动累加积分
	 */
	@Override
	public void payByCard() {
		System.out.println(name + "消费,积分已累加入该会员卡");
		for (Market m : list) {
			m.payByCard();
		}
	}
}