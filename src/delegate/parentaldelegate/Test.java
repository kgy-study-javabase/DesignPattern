package delegate.parentaldelegate;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * 测试类
 * 
 * 双亲委派模型：JAVA类装载器ClassLoader 实体类实现自定义类加载器
 * 
 * 参考URL：http://blog.csdn.net/sureyonder/article/details/5564181
 * 
 * @author Administrator
 */
public class Test {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			UserDefinedClassLoader userLoader = new UserDefinedClassLoader();
			Class valcanoClass1 = userLoader.loadClass(Valcano.class.getName());

			URL url = Valcano.class.getResource(Valcano.class.getName());
			ClassLoader urlLoader = new URLClassLoader(new URL[] { url });
			Class valcanoClass2 = urlLoader.loadClass(Valcano.class.getName());
			System.out.println("valcanoClass1 classloaer = " + valcanoClass1.getClassLoader());
			System.out.println("valcanoClass1 getClass = " + valcanoClass1.getClassLoader().getClass());
			System.out.println("valcanoClass2 classloaer = " + valcanoClass2.getClassLoader());
			System.out.println("valcanoClass2 getClass = " + valcanoClass2.getClassLoader().getClass());
			System.out.println("valcanoClass1 = valcanoClass2 ? " + (valcanoClass1 == valcanoClass2));
			System.out.println("valcanoClass1 equals valcanoClass2 ? " + (valcanoClass1.equals(valcanoClass2)));
			System.out.println("valcanoClass1 instanceof Valcano ? " + (valcanoClass1.newInstance() instanceof Valcano));
			System.out.println("valcanoClass2 instanceof Valcano ? " + (valcanoClass1.newInstance() instanceof Valcano));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}