package createpattern.prototype.deepclone;

/**
 * 参考URL： http://www.cnblogs.com/yxnchinahlj/archive/2010/09/20/1831615.html
 * 
 * @author Administrator
 */
public class Student implements Cloneable {
	String name;

	int age;

	Professor p;

	Student(String name, int age, Professor p) {
		this.name = name;
		this.age = age;
		this.p = p;
	}

	public Object clone() {
		Student o = null;
		try {
			o = (Student) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.toString());
		}
		// 如果此操作很重要，如果去就是浅克隆
		o.p = (Professor) p.clone();
		return o;
	}

	public static void main(String[] args) {
		Professor p = new Professor("wangwu", 50);
		Student s1 = new Student("zhangsan", 18, p);
		Student s2 = (Student) s1.clone();
		s2.p.name = "lisi";
		s2.p.age = 30;
		// 学生1的教授不改变。
		System.out.println("s1.name=" + s1.p.name + "," + "s1.age=" + s1.p.age);
		System.out.println("s2.name=" + s2.p.name + "," + "s2.age=" + s2.p.age);
	}
}