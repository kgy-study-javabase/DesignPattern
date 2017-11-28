package behaviorpattern.mediator.client;

import behaviorpattern.mediator.concretemediator.ProjectManager;

/**
 * 客户端角色类
 * 
 * 参考URL：http://blog.csdn.net/codywangziham01/article/details/45313621
 * http://www.cnblogs.com/Java-my-life/archive/2012/06/20/2554024.html
 * 
 * @author Administrator
 */
public class Client {
	public static void main(String[] args) {
		ProjectManager projectManager = new ProjectManager();
		projectManager.doAction();
	}
}