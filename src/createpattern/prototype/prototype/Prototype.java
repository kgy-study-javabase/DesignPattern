package createpattern.prototype.prototype;

public class Prototype implements Cloneable {
	public String name;

	/**
	 * 如果我们要用a2保存a1对象的数据，但又不希望a2对象数据被改变时不影响到a1。 实现clone（）方法是其一种最简单，也是最高效的手段。
	 * 下面我们来实现A的clone方法
	 * 参考URL：http://lovelace.iteye.com/blog/182772
	 */
	public Object clone() {
		Prototype o = null;
		try {
			o = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}