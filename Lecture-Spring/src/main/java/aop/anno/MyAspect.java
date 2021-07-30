package aop.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// .xml 파일에 공통 코드 실행 정보를 적지 않음,
//여기서 annotation으로 공통 코드 주입 시점을 정하자

@Aspect
public class MyAspect {
	
	// 핵심 메소드가 실행되기 '전에' 공통 코드 실행
	@Before("execution(void aop.*.*.work())")
	public void gotoOffice() {
		
		System.out.println("출근을 합니다");
	}
	
	@After("execution(void aop.*.*.work())")
	public void getOffOffice() {
		
		System.out.println("퇴근을 합니다");
		
	}
}
