package createpattern.prototype.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Husband implements Cloneable, Serializable {
	private static final long serialVersionUID = -925223243985311256L;

	private Wife wife;

	private Date birthday;

	public Husband() {
		wife = new Wife();
		birthday = new Date();
	}

	public Wife getWife() {
		return wife;
	}

	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 浅克隆一个对象
	 */
	@SuppressWarnings("finally")
	public Object clone() {
		Husband husband = null;
		try {
			husband = (Husband) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} finally {
			return husband;
		}
	}

	/**
	 * 利用串行化深克隆一个对象，把对象以及它的引用读到流里，在写入其他的对象
	 * 
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		// 将对象写到流里
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		// 从流里读回来
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}