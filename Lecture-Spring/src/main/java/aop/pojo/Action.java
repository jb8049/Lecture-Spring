package aop.pojo;

public class Action {
	//공통의 코드를 모아놓은 클래스
	
	public static void gotoOffice() {
		//이것만 고쳐주면, 중복되는 코드들을 한 번에 수정할 수 있음
		System.out.println("출근을 합니다");
	}
	
	public static void goOffOffice() {
		System.out.println("퇴근을 합니다");
	}
}
