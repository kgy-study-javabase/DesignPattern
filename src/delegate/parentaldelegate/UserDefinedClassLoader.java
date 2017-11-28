package delegate.parentaldelegate;

import java.io.IOException;
import java.io.InputStream;

public class UserDefinedClassLoader extends ClassLoader {
	private String extensionType = ".class";

	// this set the parent as the AppClassLoader by default
	public UserDefinedClassLoader() {
		super();
	}

	public UserDefinedClassLoader(ClassLoader parent) {
		super(parent);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class findClass(String name) {
		byte[] data = null;
		try {
			data = this.loadClassData(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defineClass(name, data, 0, data.length);
	}

	private byte[] loadClassData(String name) throws IOException {
		byte[] data = null;
		InputStream is = null;
		try {
			is = this.getClass().getResourceAsStream(name + this.extensionType);
			data = new byte[is.available()];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
		}
		return data;
	}
}