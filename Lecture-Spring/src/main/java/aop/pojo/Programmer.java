package aop.pojo;

public class Programmer implements Employee {

	public void work() {
//		System.out.println("출근한다");
		Action.gotoOffice();
		System.out.println("시스템 개발을 합니다");
		Action.goOffOffice();
		
//		System.out.println("퇴근한다");
	}

}
