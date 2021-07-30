package aop.pojo;

public class Manager implements Employee {

	public void work() {
		
		// Action.gotoOffice같은 출근한다, 퇴근한다 공통코드를 개발자가 안써주면,
		// 실행이 안됨
		System.out.println("팀원들과 회의를 합니다.");
	}

}
