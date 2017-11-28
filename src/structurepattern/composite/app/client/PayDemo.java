package structurepattern.composite.app.client;

import structurepattern.composite.app.composite.MarketBranch;
import structurepattern.composite.app.leaf.MarketJoin;

/**
 * 测试类 参考URL：http://blog.csdn.net/jason0539/article/details/22642281
 * http://blog.csdn.net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class PayDemo {
	public static void main(String[] args) {
		MarketBranch rootBranch = new MarketBranch("总店");
		MarketBranch qhdBranch = new MarketBranch("秦皇岛分店");
		MarketJoin hgqJoin = new MarketJoin("秦皇岛分店一海港区加盟店");
		MarketJoin btlJoin = new MarketJoin("秦皇岛分店二白塔岭加盟店");

		qhdBranch.add(hgqJoin);
		qhdBranch.add(btlJoin);
		rootBranch.add(qhdBranch);
		rootBranch.payByCard();
	}
}