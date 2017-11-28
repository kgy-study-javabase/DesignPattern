package structurepattern.composite.app.leaf;

import structurepattern.composite.app.component.Market;

/**
 * 组合部件类
 * 
 * 树叶构件角色(Leaf)
 * 
 * 加盟店 下面不在有分店和加盟店，最底层
 * 
 * @author Administrator
 */
public class MarketJoin extends Market {
	public MarketJoin(String s) {
		this.name = s;
	}

	@Override
	public void add(Market m) {
	}

	@Override
	public void remove(Market m) {
	}

	@Override
	public void payByCard() {
		System.out.println(name + "消费,积分已累加入该会员卡");
	}
}