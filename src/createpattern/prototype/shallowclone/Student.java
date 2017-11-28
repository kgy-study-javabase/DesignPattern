package createpattern.prototype.shallowclone;

/**
 * 参考URL： http://www.cnblogs.com/yxnchinahlj/archive/2010/09/20/1831615.html
 * 
 * @author Administrator
 */
public class Student implements Cloneable {
	// 常量对象。
	String name;

	int age;

	// 学生1和学生2的引用值都是一样的。
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
		return o;
	}

	public static void main(String[] args) {
		Professor p = new Professor("wangwu", 50);
		Student s1 = new Student("zhangsan", 18, p);
		Student s2 = (Student) s1.clone();
		s2.p.name = "lisi";
		s2.p.age = 30;
		// 学生1的教授成为lisi,age为30。
		System.out.println("s1.name=" + s1.p.name + "," + "s1.age=" + s1.p.age);
		System.out.println("s2.name=" + s2.p.name + "," + "s2.age=" + s2.p.age);
	}
}