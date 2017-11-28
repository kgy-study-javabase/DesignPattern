package behaviorpattern.mediator.concretemediator;

import behaviorpattern.mediator.colleague.Colleague;
import behaviorpattern.mediator.colleague.Designer;
import behaviorpattern.mediator.colleague.FangDeveloper;
import behaviorpattern.mediator.colleague.Tester;
import behaviorpattern.mediator.colleague.YanDeveloper;
import behaviorpattern.mediator.mediator.IProjectManager;

/**
 * ProjectManager 负责处理同事之间的工作
 * 
 * 具体调停者（Concrete Mediator）角色
 * 
 * @author Administrator
 */
public class ProjectManager implements IProjectManager {
	private FangDeveloper fang;

	private YanDeveloper yan;

	private Tester tester;

	@Override
	public void toNextColleague(Colleague c) {
		// ba la ba la and so on
		if (c instanceof Designer) {
			fang.coding();
		} else if (c instanceof FangDeveloper) {
			yan.coding();
		} else if (c instanceof YanDeveloper) {
			tester.test();
		} else if (c instanceof Tester) {
			System.err.println("可以交给boss了");
		}
	}

	public void doAction() {
		Designer designer = new Designer(this);
		fang = new FangDeveloper(this);
		yan = new YanDeveloper(this);
		tester = new Tester(this);
		designer.disignerImage();
	}
}