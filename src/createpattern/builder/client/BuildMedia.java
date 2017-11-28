package createpattern.builder.client;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import createpattern.builder.concretebuilder.BookBuilder;
import createpattern.builder.concretebuilder.MagazineBuilder;
import createpattern.builder.concretebuilder.WebSiteBuilder;
import createpattern.builder.director.MediaDirector;
import createpattern.builder.product.item.MediaItem;
import createpattern.builder.product.model.Media;

/**
 * JUnit的使用非常简单，共有3步： 第一步、编写测试类，使其继承TestCase； 第二步、编写测试方法，使用test+×××的方式来命名测试方法；
 * 第三步、编写断言。如果测试方法有公用的变量等需要初始化和销毁，则可以使用setUp,tearDown方法。
 * 
 * 测试程序——客户程序角色
 * 
 * 参考URL：http://blog.csdn.net/yueweiac110/article/details/5376476
 * 
 * @author Administrator
 */
public class BuildMedia extends TestCase {
	/**
	 * 客户程序角色
	 * 
	 * (1)该方法对于基本数据类型的数组支持并不好,当数组是基本数据类型时不建议使用
	 * (2)当使用asList()方法时，数组就和列表链接在一起了.当更新其中之一时，另一个将自动获得更新。
	 * 注意:仅仅针对对象数组类型,基本数据类型数组不具备该特性 (3)asList得到的数组是的没有add和remove方法的
	 * 
	 * 参考URL：http://blog.csdn.net/cntanghai/article/details/7188296
	 */
	private List<MediaItem> input = Arrays
		.asList(new MediaItem[] { new MediaItem("item1"), new MediaItem("item2"), new MediaItem("item3"), new MediaItem("item4") });

	/**
	 * 测试方法
	 */
	public void testBook() {
		MediaDirector buildBook = new MediaDirector(new BookBuilder());
		Media book = buildBook.produceMedia(input);
		String result = "book: " + book;
		System.out.println(result);
		// 利用断言方式判断对象是否与设定值一致
		assertEquals(result, "book: [item1, item2, item3, item4]");
	}

	/**
	 * 测试方法
	 */
	public void testMagazine() {
		MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
		Media magazine = buildMagazine.produceMedia(input);
		String result = "magazine: " + magazine;
		System.out.println(result);
		// 利用断言方式判断对象是否与设定值一致
		assertEquals(result, "magazine: [item1, item2, item3, item4]");
	}

	/**
	 * 测试方法
	 */
	public void testWebSite() {
		MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
		Media webSite = buildWebSite.produceMedia(input);
		String result = "web site: " + webSite;
		System.out.println(result);
		// 利用断言方式判断对象是否与设定值一致
		assertEquals(result, "web site: [item1, item2, item3, item4]");
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(BuildMedia.class);
	}
}