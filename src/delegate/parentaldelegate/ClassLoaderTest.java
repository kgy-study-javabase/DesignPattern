package delegate.parentaldelegate;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试类
 * 
 * 双亲委派模型：JAVA类装载器ClassLoader 匿名内部类实现自定义类加载器
 * 
 * 参考URL：http://blog.csdn.net/p10010/article/details/50448491
 * 
 * @author Administrator
 */
public class ClassLoaderTest {
	public static void main(String[] args) throws Exception {
		// 匿名内部类实现自定义类加载器
		ClassLoader myClassLoader = new ClassLoader() {
			protected Class<?> findClass(String name) throws ClassNotFoundException {
				byte[] data = null;
				// 获取类文件名
				String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
				InputStream is = null;
				try {
					is = this.getClass().getResourceAsStream(fileName);
					data = new byte[is.available()];
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (is != null) {
						try {
							is.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				return defineClass(name, data, 0, data.length);
			}
		};

		Object obj = myClassLoader.loadClass(ClassLoaderTest.class.getName()).newInstance();
		System.out.println("obj getClass = " + obj.getClass());
		System.out.println("obj getClassLoader = " + obj.getClass().getClassLoader());
		System.out.println("obj instanceof = ClassLoaderTest ? " + (obj instanceof ClassLoaderTest));
		System.out.println("obj instanceof = Test ? " + (obj instanceof Test));

		obj = myClassLoader.loadClass(Test.class.getName()).newInstance();
		System.out.println("obj getClass = " + obj.getClass());
		System.out.println("obj getClassLoader = " + obj.getClass().getClassLoader());
		System.out.println("obj instanceof = ClassLoaderTest ? " + (obj instanceof ClassLoaderTest));
		System.out.println("obj instanceof = Test ? " + (obj instanceof Test));
	}
}