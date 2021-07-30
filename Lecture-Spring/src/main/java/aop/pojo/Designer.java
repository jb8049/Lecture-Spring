package aop.pojo;

public class Designer implements Employee {

	public void work() {
//		System.out.println("출근한다");
		Action.gotoOffice();
		System.out.println("제품 디자인을 한다");
		Action.goOffOffice();
//		System.out.println("퇴근한다");
	}

}
