package createpattern.prototype.clone;

import java.io.Serializable;
import java.util.Date;

public class Wife implements Serializable {
	private static final long serialVersionUID = 1822960182401987380L;

	private String name;

	private Date birthday;

	public Wife() {
		name = "芙蓉姐姐";
		birthday = new Date();
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}