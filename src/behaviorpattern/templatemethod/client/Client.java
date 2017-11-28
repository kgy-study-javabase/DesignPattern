package behaviorpattern.templatemethod.client;

import behaviorpattern.templatemethod.concreteclass.Student;
import behaviorpattern.templatemethod.concreteclass.Teacher;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/jason0539/article/details/45037535
 * http://blog/csdn/net/jason0539/article/category/3092021
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		Student student = new Student();
		student.prepareGotoSchool();

		Teacher teacher = new Teacher();
		teacher.prepareGotoSchool();
	}
}