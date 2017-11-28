package structurepattern.adapter.classadapter;

import structurepattern.adapter.common.Target;

/**
 * 适配器类，继承了被适配类，同时实现标准接口
 * 
 * @author Administrator
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void request() {
		super.specificRequest();
	}
}